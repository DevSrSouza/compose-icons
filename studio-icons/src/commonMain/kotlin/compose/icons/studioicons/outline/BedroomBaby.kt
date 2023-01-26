package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.BedroomBaby: ImageVector
    get() {
        if (_bedroomBaby != null) {
            return _bedroomBaby!!
        }
        _bedroomBaby = Builder(name = "BedroomBaby", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.94f, 14.04f)
                curveToRelative(-0.34f, 0.34f, -0.71f, 0.64f, -1.1f, 0.92f)
                lineTo(16.0f, 13.5f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-5.62f)
                lineTo(9.65f, 7.0f)
                horizontalLineTo(6.0f)
                lineToRelative(1.0f, 0.76f)
                lineTo(5.5f, 9.5f)
                lineToRelative(0.95f, 1.0f)
                lineTo(8.0f, 9.51f)
                verticalLineToRelative(3.99f)
                lineToRelative(-0.84f, 1.46f)
                curveToRelative(-0.39f, -0.27f, -0.76f, -0.58f, -1.1f, -0.92f)
                lineTo(5.0f, 15.1f)
                curveToRelative(1.87f, 1.87f, 4.36f, 2.9f, 7.0f, 2.9f)
                reflectiveCurveToRelative(5.13f, -1.03f, 7.0f, -2.9f)
                lineTo(17.94f, 14.04f)
                close()
                moveTo(8.45f, 15.71f)
                lineToRelative(0.03f, -0.06f)
                lineToRelative(0.81f, -1.41f)
                curveToRelative(1.74f, 0.65f, 3.66f, 0.65f, 5.4f, 0.0f)
                lineToRelative(0.81f, 1.41f)
                lineToRelative(0.03f, 0.06f)
                curveToRelative(-1.1f, 0.51f, -2.3f, 0.79f, -3.55f, 0.79f)
                reflectiveCurveTo(9.55f, 16.23f, 8.45f, 15.71f)
                close()
                moveTo(20.0f, 4.0f)
                verticalLineToRelative(16.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(20.0f)
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
            }
        }
        .build()
        return _bedroomBaby!!
    }

private var _bedroomBaby: ImageVector? = null
