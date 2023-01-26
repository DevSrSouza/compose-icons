package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.ImageSearch: ImageVector
    get() {
        if (_imageSearch != null) {
            return _imageSearch!!
        }
        _imageSearch = Builder(name = "ImageSearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 15.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                lineTo(5.0f, 20.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                lineTo(4.0f, 7.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.02f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                lineTo(4.0f, 4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                close()
                moveTo(15.5f, 18.0f)
                lineTo(6.52f, 18.0f)
                curveToRelative(-0.42f, 0.0f, -0.65f, -0.48f, -0.39f, -0.81f)
                lineToRelative(1.74f, -2.23f)
                curveToRelative(0.2f, -0.25f, 0.58f, -0.26f, 0.78f, -0.01f)
                lineToRelative(1.56f, 1.88f)
                lineToRelative(2.35f, -3.02f)
                curveToRelative(0.2f, -0.26f, 0.6f, -0.26f, 0.79f, 0.01f)
                lineToRelative(2.55f, 3.39f)
                curveToRelative(0.25f, 0.32f, 0.01f, 0.79f, -0.4f, 0.79f)
                close()
                moveTo(19.3f, 8.89f)
                curveToRelative(0.48f, -0.77f, 0.75f, -1.67f, 0.69f, -2.66f)
                curveToRelative(-0.13f, -2.15f, -1.84f, -3.97f, -3.97f, -4.2f)
                curveTo(13.3f, 1.73f, 11.0f, 3.84f, 11.0f, 6.5f)
                curveToRelative(0.0f, 2.49f, 2.01f, 4.5f, 4.49f, 4.5f)
                curveToRelative(0.88f, 0.0f, 1.7f, -0.26f, 2.39f, -0.7f)
                lineToRelative(2.41f, 2.41f)
                curveToRelative(0.39f, 0.39f, 1.03f, 0.39f, 1.42f, 0.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, 0.0f, -1.42f)
                lineToRelative(-2.41f, -2.4f)
                close()
                moveTo(15.5f, 9.0f)
                curveTo(14.12f, 9.0f, 13.0f, 7.88f, 13.0f, 6.5f)
                reflectiveCurveTo(14.12f, 4.0f, 15.5f, 4.0f)
                reflectiveCurveTo(18.0f, 5.12f, 18.0f, 6.5f)
                reflectiveCurveTo(16.88f, 9.0f, 15.5f, 9.0f)
                close()
            }
        }
        .build()
        return _imageSearch!!
    }

private var _imageSearch: ImageVector? = null
