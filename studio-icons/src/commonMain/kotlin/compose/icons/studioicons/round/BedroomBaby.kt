package compose.icons.studioicons.round

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
import compose.icons.studioicons.RoundGroup

public val RoundGroup.BedroomBaby: ImageVector
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
                moveTo(12.0f, 17.99f)
                curveToRelative(-2.37f, 0.0f, -4.61f, -0.83f, -6.4f, -2.35f)
                curveToRelative(-0.33f, -0.28f, -0.35f, -0.8f, -0.04f, -1.11f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.27f, -0.27f, 0.71f, -0.29f, 1.01f, -0.04f)
                curveToRelative(0.19f, 0.16f, 0.39f, 0.31f, 0.6f, 0.46f)
                lineTo(8.0f, 13.49f)
                verticalLineTo(9.5f)
                lineToRelative(-1.0f, 0.65f)
                curveToRelative(-0.32f, 0.21f, -0.73f, 0.16f, -0.99f, -0.12f)
                lineTo(6.0f, 10.01f)
                curveToRelative(-0.29f, -0.3f, -0.3f, -0.77f, -0.03f, -1.08f)
                curveTo(6.27f, 8.6f, 6.62f, 8.19f, 6.83f, 7.95f)
                curveTo(6.92f, 7.84f, 6.9f, 7.67f, 6.79f, 7.59f)
                curveToRelative(0.0f, 0.0f, -0.81f, -0.31f, -0.79f, -0.57f)
                curveTo(6.0f, 6.91f, 9.36f, 6.99f, 9.36f, 6.99f)
                curveToRelative(0.18f, 0.0f, 0.34f, 0.1f, 0.43f, 0.25f)
                lineToRelative(1.44f, 2.5f)
                curveToRelative(0.09f, 0.15f, 0.25f, 0.25f, 0.43f, 0.25f)
                horizontalLineToRelative(4.83f)
                curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(2.5f)
                lineToRelative(0.84f, 1.46f)
                curveToRelative(0.2f, -0.15f, 0.4f, -0.3f, 0.6f, -0.46f)
                curveToRelative(0.3f, -0.25f, 0.73f, -0.23f, 1.01f, 0.04f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.31f, 0.31f, 0.29f, 0.82f, -0.04f, 1.11f)
                curveTo(16.61f, 17.16f, 14.37f, 17.99f, 12.0f, 17.99f)
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
