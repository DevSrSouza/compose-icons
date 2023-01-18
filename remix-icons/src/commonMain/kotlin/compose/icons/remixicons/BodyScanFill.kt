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

public val RemixIcons.BodyScanFill: ImageVector
    get() {
        if (_bodyScanFill != null) {
            return _bodyScanFill!!
        }
        _bodyScanFill = Builder(name = "BodyScanFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 16.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(22.0f, 16.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(7.5f, 7.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 9.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, -3.499f, 5.767f)
                lineTo(15.0f, 19.0f)
                lineTo(9.0f, 19.0f)
                verticalLineToRelative(-6.232f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 5.5f, 7.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(12.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, -5.0f)
                close()
                moveTo(8.0f, 2.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(-4.0f, -0.001f)
                lineTo(4.0f, 8.0f)
                lineTo(2.0f, 8.0f)
                lineTo(2.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(22.0f, 2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(20.0f, 4.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(16.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _bodyScanFill!!
    }

private var _bodyScanFill: ImageVector? = null
