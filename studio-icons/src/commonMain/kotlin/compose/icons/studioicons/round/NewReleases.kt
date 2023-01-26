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

public val RoundGroup.NewReleases: ImageVector
    get() {
        if (_newReleases != null) {
            return _newReleases!!
        }
        _newReleases = Builder(name = "NewReleases", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.42f, 11.34f)
                lineToRelative(-1.86f, -2.12f)
                lineToRelative(0.26f, -2.81f)
                curveToRelative(0.05f, -0.5f, -0.29f, -0.96f, -0.77f, -1.07f)
                lineToRelative(-2.76f, -0.63f)
                lineToRelative(-1.44f, -2.43f)
                curveToRelative(-0.26f, -0.43f, -0.79f, -0.61f, -1.25f, -0.41f)
                lineTo(12.0f, 3.0f)
                lineTo(9.41f, 1.89f)
                curveToRelative(-0.46f, -0.2f, -1.0f, -0.02f, -1.25f, 0.41f)
                lineTo(6.71f, 4.72f)
                lineToRelative(-2.75f, 0.62f)
                curveToRelative(-0.49f, 0.11f, -0.83f, 0.56f, -0.78f, 1.07f)
                lineToRelative(0.26f, 2.8f)
                lineToRelative(-1.86f, 2.13f)
                curveToRelative(-0.33f, 0.38f, -0.33f, 0.94f, 0.0f, 1.32f)
                lineToRelative(1.86f, 2.12f)
                lineToRelative(-0.26f, 2.82f)
                curveToRelative(-0.05f, 0.5f, 0.29f, 0.96f, 0.77f, 1.07f)
                lineToRelative(2.76f, 0.63f)
                lineToRelative(1.44f, 2.42f)
                curveToRelative(0.26f, 0.43f, 0.79f, 0.61f, 1.26f, 0.41f)
                lineTo(12.0f, 21.0f)
                lineToRelative(2.59f, 1.11f)
                curveToRelative(0.46f, 0.2f, 1.0f, 0.02f, 1.25f, -0.41f)
                lineToRelative(1.44f, -2.43f)
                lineToRelative(2.76f, -0.63f)
                curveToRelative(0.49f, -0.11f, 0.82f, -0.57f, 0.77f, -1.07f)
                lineToRelative(-0.26f, -2.81f)
                lineToRelative(1.86f, -2.12f)
                curveToRelative(0.34f, -0.36f, 0.34f, -0.92f, 0.01f, -1.3f)
                close()
                moveTo(13.0f, 17.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                lineTo(11.0f, 8.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _newReleases!!
    }

private var _newReleases: ImageVector? = null
