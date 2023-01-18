package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.Safe2Fill: ImageVector
    get() {
        if (_safe2Fill != null) {
            return _safe2Fill!!
        }
        _safe2Fill = Builder(name = "Safe2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 20.0f)
                lineTo(6.0f, 20.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 22.0f)
                verticalLineToRelative(-2.0f)
                lineTo(3.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(7.0f)
                lineTo(10.0f, 1.59f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.582f, -0.493f)
                lineToRelative(10.582f, 1.764f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.836f, 0.986f)
                lineTo(22.0f, 6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.153f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.836f, 0.986f)
                lineTo(20.0f, 20.333f)
                lineTo(20.0f, 22.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.333f)
                lineToRelative(-7.418f, 1.236f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 10.0f, 21.41f)
                lineTo(10.0f, 20.0f)
                close()
                moveTo(12.0f, 19.64f)
                lineToRelative(8.0f, -1.334f)
                lineTo(20.0f, 4.694f)
                lineToRelative(-8.0f, -1.333f)
                verticalLineToRelative(16.278f)
                close()
                moveTo(16.5f, 14.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -1.12f, -1.5f, -2.5f)
                reflectiveCurveTo(15.672f, 9.0f, 16.5f, 9.0f)
                reflectiveCurveToRelative(1.5f, 1.12f, 1.5f, 2.5f)
                reflectiveCurveToRelative(-0.672f, 2.5f, -1.5f, 2.5f)
                close()
            }
        }
        .build()
        return _safe2Fill!!
    }

private var _safe2Fill: ImageVector? = null
