package compose.icons.studioicons.sharp

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
import compose.icons.studioicons.SharpGroup

public val SharpGroup.ElderlyWoman: ImageVector
    get() {
        if (_elderlyWoman != null) {
            return _elderlyWoman!!
        }
        _elderlyWoman = Builder(name = "ElderlyWoman", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 11.0f)
                curveToRelative(-1.56f, 0.0f, -2.92f, -0.9f, -3.58f, -2.21f)
                lineToRelative(-0.79f, -1.67f)
                lineToRelative(0.0f, 0.0f)
                curveTo(14.12f, 7.1f, 13.63f, 6.0f, 12.34f, 6.0f)
                lineToRelative(0.0f, 0.0f)
                curveTo(8.72f, 6.0f, 6.0f, 16.69f, 6.0f, 19.0f)
                horizontalLineToRelative(2.5f)
                lineToRelative(-2.1f, 2.8f)
                lineTo(8.0f, 23.0f)
                lineToRelative(3.0f, -4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.03f)
                lineTo(13.0f, 13.0f)
                lineToRelative(0.49f, -2.71f)
                curveToRelative(0.81f, 1.23f, 2.05f, 2.14f, 3.51f, 2.52f)
                verticalLineToRelative(0.69f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineTo(23.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(12.5f)
                curveTo(20.0f, 11.67f, 19.33f, 11.0f, 18.5f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.6f, 2.91f)
                curveToRelative(-0.06f, 0.19f, -0.1f, 0.38f, -0.1f, 0.59f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                curveToRelative(-0.21f, 0.0f, -0.4f, 0.04f, -0.59f, 0.1f)
                curveTo(12.76f, 1.25f, 12.41f, 1.0f, 12.0f, 1.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                curveTo(11.0f, 2.41f, 11.25f, 2.76f, 11.6f, 2.91f)
                close()
            }
        }
        .build()
        return _elderlyWoman!!
    }

private var _elderlyWoman: ImageVector? = null
