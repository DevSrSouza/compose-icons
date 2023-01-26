package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.Subway: ImageVector
    get() {
        if (_subway != null) {
            return _subway!!
        }
        _subway = Builder(name = "Subway", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 16.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 16.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.01f, 9.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-10.0f)
                close()
                moveTo(17.8f, 2.8f)
                curveTo(16.0f, 2.09f, 13.86f, 2.0f, 12.0f, 2.0f)
                curveToRelative(-1.86f, 0.0f, -4.0f, 0.09f, -5.8f, 0.8f)
                curveTo(3.53f, 3.84f, 2.0f, 6.05f, 2.0f, 8.86f)
                lineTo(2.0f, 22.0f)
                horizontalLineToRelative(20.0f)
                lineTo(22.0f, 8.86f)
                curveToRelative(0.0f, -2.81f, -1.53f, -5.02f, -4.2f, -6.06f)
                close()
                moveTo(18.0f, 15.88f)
                curveToRelative(0.0f, 1.45f, -1.18f, 2.62f, -2.63f, 2.62f)
                lineToRelative(1.13f, 1.12f)
                lineTo(16.5f, 20.0f)
                lineTo(15.0f, 20.0f)
                lineToRelative(-1.5f, -1.5f)
                horizontalLineToRelative(-2.83f)
                lineTo(9.17f, 20.0f)
                lineTo(7.5f, 20.0f)
                verticalLineToRelative(-0.38f)
                lineToRelative(1.12f, -1.12f)
                curveTo(7.18f, 18.5f, 6.0f, 17.32f, 6.0f, 15.88f)
                lineTo(6.0f, 9.0f)
                curveToRelative(0.0f, -2.63f, 3.0f, -3.0f, 6.0f, -3.0f)
                curveToRelative(3.32f, 0.0f, 6.0f, 0.38f, 6.0f, 3.0f)
                verticalLineToRelative(6.88f)
                close()
            }
        }
        .build()
        return _subway!!
    }

private var _subway: ImageVector? = null
