package compose.icons.studioicons.outline

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
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.Contactless: ImageVector
    get() {
        if (_contactless != null) {
            return _contactless!!
        }
        _contactless = Builder(name = "Contactless", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f)
                reflectiveCurveToRelative(3.58f, -8.0f, 8.0f, -8.0f)
                reflectiveCurveToRelative(8.0f, 3.58f, 8.0f, 8.0f)
                reflectiveCurveTo(16.42f, 20.0f, 12.0f, 20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.1f, 10.18f)
                curveToRelative(0.26f, 0.56f, 0.39f, 1.16f, 0.4f, 1.8f)
                curveToRelative(0.01f, 0.63f, -0.13f, 1.25f, -0.4f, 1.86f)
                lineToRelative(1.37f, 0.62f)
                curveToRelative(0.37f, -0.81f, 0.55f, -1.65f, 0.54f, -2.5f)
                curveToRelative(-0.01f, -0.84f, -0.19f, -1.65f, -0.54f, -2.4f)
                lineTo(7.1f, 10.18f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.33f, 7.33f)
                curveToRelative(0.78f, 1.57f, 1.18f, 3.14f, 1.18f, 4.64f)
                curveToRelative(0.0f, 1.51f, -0.4f, 3.09f, -1.18f, 4.69f)
                lineToRelative(1.35f, 0.66f)
                curveToRelative(0.88f, -1.81f, 1.33f, -3.61f, 1.33f, -5.35f)
                curveToRelative(0.0f, -1.74f, -0.45f, -3.53f, -1.33f, -5.31f)
                lineTo(13.33f, 7.33f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.2f, 8.72f)
                curveToRelative(0.53f, 1.07f, 0.8f, 2.21f, 0.8f, 3.4f)
                curveToRelative(0.0f, 1.17f, -0.26f, 2.23f, -0.78f, 3.15f)
                lineToRelative(1.3f, 0.74f)
                curveToRelative(0.65f, -1.15f, 0.98f, -2.45f, 0.98f, -3.89f)
                curveToRelative(0.0f, -1.42f, -0.32f, -2.79f, -0.96f, -4.07f)
                lineTo(10.2f, 8.72f)
                close()
            }
        }
        .build()
        return _contactless!!
    }

private var _contactless: ImageVector? = null
