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

public val BaselineGroup.BedroomBaby: ImageVector
    get() {
        if (_bedroomBaby != null) {
            return _bedroomBaby!!
        }
        _bedroomBaby = Builder(name = "BedroomBaby", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-2.64f, 0.0f, -5.13f, -1.03f, -7.0f, -2.9f)
                lineToRelative(1.06f, -1.06f)
                curveToRelative(0.34f, 0.34f, 0.71f, 0.65f, 1.1f, 0.92f)
                lineTo(8.0f, 13.5f)
                verticalLineTo(9.51f)
                lineTo(6.45f, 10.5f)
                lineToRelative(-0.95f, -1.0f)
                lineTo(7.0f, 7.76f)
                lineTo(6.0f, 7.0f)
                horizontalLineToRelative(3.65f)
                lineToRelative(1.73f, 3.0f)
                horizontalLineTo(17.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.5f)
                lineToRelative(0.84f, 1.46f)
                curveToRelative(0.39f, -0.28f, 0.76f, -0.58f, 1.1f, -0.92f)
                lineTo(19.0f, 15.1f)
                curveTo(17.13f, 16.97f, 14.64f, 18.0f, 12.0f, 18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.69f, 14.24f)
                curveToRelative(-1.74f, 0.65f, -3.66f, 0.65f, -5.4f, 0.0f)
                lineToRelative(-0.81f, 1.41f)
                lineToRelative(-0.03f, 0.06f)
                curveToRelative(1.1f, 0.52f, 2.28f, 0.79f, 3.53f, 0.79f)
                reflectiveCurveToRelative(2.45f, -0.28f, 3.55f, -0.79f)
                lineToRelative(-0.03f, -0.06f)
                lineTo(14.69f, 14.24f)
                close()
            }
        }
        .build()
        return _bedroomBaby!!
    }

private var _bedroomBaby: ImageVector? = null
