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

public val TwotoneGroup.ExposureNeg2: ImageVector
    get() {
        if (_exposureNeg2 != null) {
            return _exposureNeg2!!
        }
        _exposureNeg2 = Builder(name = "ExposureNeg2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.98f, 10.1f)
                curveToRelative(-0.14f, 0.25f, -0.32f, 0.53f, -0.56f, 0.83f)
                curveToRelative(-0.23f, 0.3f, -0.52f, 0.65f, -0.88f, 1.03f)
                lineToRelative(-4.17f, 4.55f)
                verticalLineTo(18.0f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(-1.71f)
                horizontalLineToRelative(-5.95f)
                lineToRelative(2.86f, -3.07f)
                curveToRelative(0.38f, -0.39f, 0.72f, -0.79f, 1.04f, -1.18f)
                reflectiveCurveToRelative(0.59f, -0.78f, 0.82f, -1.17f)
                curveToRelative(0.23f, -0.39f, 0.41f, -0.78f, 0.54f, -1.17f)
                curveToRelative(0.13f, -0.39f, 0.19f, -0.79f, 0.19f, -1.18f)
                curveToRelative(0.0f, -0.53f, -0.09f, -1.02f, -0.27f, -1.46f)
                reflectiveCurveToRelative(-0.44f, -0.81f, -0.78f, -1.11f)
                curveToRelative(-0.34f, -0.31f, -0.77f, -0.54f, -1.26f, -0.71f)
                curveToRelative(-0.51f, -0.16f, -1.08f, -0.24f, -1.72f, -0.24f)
                curveToRelative(-0.69f, 0.0f, -1.31f, 0.11f, -1.85f, 0.32f)
                curveToRelative(-0.54f, 0.21f, -1.0f, 0.51f, -1.36f, 0.88f)
                curveToRelative(-0.37f, 0.37f, -0.65f, 0.8f, -0.84f, 1.3f)
                curveToRelative(-0.18f, 0.47f, -0.27f, 0.97f, -0.28f, 1.5f)
                horizontalLineToRelative(2.14f)
                curveToRelative(0.01f, -0.31f, 0.05f, -0.6f, 0.13f, -0.87f)
                curveToRelative(0.09f, -0.29f, 0.23f, -0.54f, 0.4f, -0.75f)
                curveToRelative(0.18f, -0.21f, 0.41f, -0.37f, 0.68f, -0.49f)
                curveToRelative(0.27f, -0.12f, 0.6f, -0.18f, 0.96f, -0.18f)
                curveToRelative(0.31f, 0.0f, 0.58f, 0.05f, 0.81f, 0.15f)
                reflectiveCurveToRelative(0.43f, 0.25f, 0.59f, 0.43f)
                curveToRelative(0.16f, 0.18f, 0.28f, 0.4f, 0.37f, 0.65f)
                curveToRelative(0.08f, 0.25f, 0.13f, 0.52f, 0.13f, 0.81f)
                curveToRelative(0.0f, 0.22f, -0.03f, 0.43f, -0.08f, 0.65f)
                curveToRelative(-0.06f, 0.22f, -0.15f, 0.45f, -0.29f, 0.7f)
                close()
                moveTo(2.0f, 11.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _exposureNeg2!!
    }

private var _exposureNeg2: ImageVector? = null
