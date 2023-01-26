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

public val RoundGroup.PhotoFilter: ImageVector
    get() {
        if (_photoFilter != null) {
            return _photoFilter!!
        }
        _photoFilter = Builder(name = "PhotoFilter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.02f, 10.99f)
                lineTo(19.02f, 18.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                lineTo(6.0f, 19.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                lineTo(5.0f, 6.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                lineTo(5.02f, 3.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                lineTo(19.0f, 21.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f)
                verticalLineToRelative(-8.01f)
                curveToRelative(0.0f, -0.55f, -0.44f, -0.99f, -0.99f, -0.99f)
                reflectiveCurveToRelative(-0.99f, 0.44f, -0.99f, 0.99f)
                close()
                moveTo(13.25f, 10.75f)
                lineTo(12.46f, 9.0f)
                curveToRelative(-0.18f, -0.39f, -0.73f, -0.39f, -0.91f, 0.0f)
                lineToRelative(-0.79f, 1.75f)
                lineToRelative(-1.76f, 0.79f)
                curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0.0f, 0.91f)
                lineToRelative(1.75f, 0.79f)
                lineToRelative(0.79f, 1.76f)
                curveToRelative(0.18f, 0.39f, 0.73f, 0.39f, 0.91f, 0.0f)
                lineToRelative(0.79f, -1.75f)
                lineToRelative(1.76f, -0.79f)
                curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0.0f, -0.91f)
                lineToRelative(-1.75f, -0.8f)
                close()
                moveTo(17.94f, 6.06f)
                lineToRelative(-0.6f, -1.32f)
                curveToRelative(-0.13f, -0.29f, -0.55f, -0.29f, -0.69f, 0.0f)
                lineToRelative(-0.6f, 1.32f)
                lineToRelative(-1.32f, 0.6f)
                curveToRelative(-0.29f, 0.13f, -0.29f, 0.55f, 0.0f, 0.69f)
                lineToRelative(1.32f, 0.6f)
                lineToRelative(0.6f, 1.32f)
                curveToRelative(0.13f, 0.29f, 0.55f, 0.29f, 0.69f, 0.0f)
                lineToRelative(0.6f, -1.32f)
                lineToRelative(1.32f, -0.6f)
                curveToRelative(0.29f, -0.13f, 0.29f, -0.55f, 0.0f, -0.69f)
                lineToRelative(-1.32f, -0.6f)
                close()
            }
        }
        .build()
        return _photoFilter!!
    }

private var _photoFilter: ImageVector? = null
