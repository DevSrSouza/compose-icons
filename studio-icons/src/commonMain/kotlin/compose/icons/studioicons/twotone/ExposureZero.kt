package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.ExposureZero: ImageVector
    get() {
        if (_exposureZero != null) {
            return _exposureZero!!
        }
        _exposureZero = Builder(name = "ExposureZero", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.01f, 6.22f)
                curveToRelative(-0.36f, -0.43f, -0.8f, -0.74f, -1.31f, -0.93f)
                reflectiveCurveTo(12.63f, 5.0f, 12.0f, 5.0f)
                curveToRelative(-0.62f, 0.0f, -1.19f, 0.1f, -1.69f, 0.29f)
                curveToRelative(-0.51f, 0.19f, -0.95f, 0.5f, -1.31f, 0.93f)
                reflectiveCurveToRelative(-0.64f, 0.99f, -0.84f, 1.69f)
                curveToRelative(-0.2f, 0.7f, -0.3f, 1.55f, -0.3f, 2.55f)
                verticalLineToRelative(2.04f)
                curveToRelative(0.0f, 1.0f, 0.1f, 1.85f, 0.3f, 2.55f)
                curveToRelative(0.2f, 0.69f, 0.49f, 1.26f, 0.85f, 1.7f)
                reflectiveCurveToRelative(0.8f, 0.75f, 1.31f, 0.95f)
                curveToRelative(0.51f, 0.2f, 1.07f, 0.3f, 1.69f, 0.3f)
                curveToRelative(0.63f, 0.0f, 1.19f, -0.1f, 1.7f, -0.3f)
                curveToRelative(0.51f, -0.2f, 0.94f, -0.51f, 1.3f, -0.95f)
                curveToRelative(0.35f, -0.43f, 0.63f, -1.0f, 0.83f, -1.7f)
                curveToRelative(0.2f, -0.7f, 0.3f, -1.55f, 0.3f, -2.55f)
                horizontalLineToRelative(0.01f)
                verticalLineToRelative(-2.04f)
                curveToRelative(0.0f, -1.01f, -0.1f, -1.85f, -0.3f, -2.55f)
                curveToRelative(-0.2f, -0.7f, -0.48f, -1.26f, -0.84f, -1.69f)
                close()
                moveTo(14.04f, 12.8f)
                curveToRelative(0.0f, 0.63f, -0.04f, 1.17f, -0.13f, 1.62f)
                curveToRelative(-0.09f, 0.45f, -0.22f, 0.81f, -0.39f, 1.09f)
                reflectiveCurveToRelative(-0.38f, 0.48f, -0.63f, 0.61f)
                reflectiveCurveToRelative(-0.54f, 0.19f, -0.87f, 0.19f)
                curveToRelative(-0.33f, 0.0f, -0.62f, -0.06f, -0.87f, -0.19f)
                reflectiveCurveToRelative(-0.47f, -0.33f, -0.64f, -0.61f)
                curveToRelative(-0.17f, -0.28f, -0.31f, -0.64f, -0.4f, -1.09f)
                curveToRelative(-0.09f, -0.44f, -0.14f, -0.98f, -0.14f, -1.62f)
                verticalLineToRelative(-2.67f)
                curveToRelative(0.0f, -0.64f, 0.04f, -1.18f, 0.13f, -1.62f)
                curveToRelative(0.09f, -0.44f, 0.23f, -0.79f, 0.4f, -1.06f)
                reflectiveCurveToRelative(0.39f, -0.46f, 0.64f, -0.58f)
                reflectiveCurveToRelative(0.54f, -0.18f, 0.86f, -0.18f)
                reflectiveCurveToRelative(0.61f, 0.06f, 0.86f, 0.19f)
                curveToRelative(0.25f, 0.12f, 0.47f, 0.31f, 0.64f, 0.58f)
                curveToRelative(0.18f, 0.27f, 0.31f, 0.62f, 0.4f, 1.06f)
                curveToRelative(0.08f, 0.44f, 0.13f, 0.98f, 0.13f, 1.62f)
                horizontalLineToRelative(0.01f)
                verticalLineToRelative(2.66f)
                close()
            }
        }
        .build()
        return _exposureZero!!
    }

private var _exposureZero: ImageVector? = null
