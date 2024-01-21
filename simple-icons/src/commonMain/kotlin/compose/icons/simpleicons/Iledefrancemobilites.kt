package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Iledefrancemobilites: ImageVector
    get() {
        if (_iledefrancemobilites != null) {
            return _iledefrancemobilites!!
        }
        _iledefrancemobilites = Builder(name = "Iledefrancemobilites", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.54f, 0.001f)
                arcTo(5.461f, 5.447f, 0.0f, false, true, 24.0f, 5.447f)
                verticalLineToRelative(13.107f)
                arcTo(5.461f, 5.447f, 0.0f, false, true, 18.54f, 24.0f)
                lineTo(5.459f, 24.0f)
                arcTo(5.461f, 5.447f, 0.0f, false, true, 0.0f, 18.553f)
                lineTo(0.0f, 5.446f)
                arcTo(5.461f, 5.447f, 0.0f, false, true, 5.46f, 0.0f)
                horizontalLineToRelative(13.081f)
                close()
                moveTo(8.759f, 15.261f)
                curveToRelative(-1.365f, 1.816f, -2.503f, 3.405f, -3.925f, 5.334f)
                curveToRelative(-0.34f, 0.454f, -0.057f, 0.624f, 0.398f, 0.34f)
                curveToRelative(0.512f, -0.34f, 0.967f, -0.736f, 1.309f, -1.247f)
                curveToRelative(0.3f, -0.421f, 0.857f, -1.175f, 1.448f, -1.977f)
                lineToRelative(0.595f, -0.808f)
                curveToRelative(0.33f, -0.445f, 0.646f, -0.876f, 0.914f, -1.243f)
                curveToRelative(0.796f, -1.135f, 2.047f, -1.023f, 2.9f, 0.17f)
                arcToRelative(398.137f, 397.144f, 0.0f, false, false, 3.242f, 4.481f)
                curveToRelative(0.739f, 1.02f, 2.957f, 0.851f, 3.924f, 0.794f)
                curveToRelative(0.17f, 0.0f, 0.228f, -0.17f, 0.17f, -0.283f)
                arcToRelative(310.878f, 310.103f, 0.0f, false, false, -4.663f, -6.467f)
                curveToRelative(-2.047f, -2.894f, -4.606f, -1.42f, -6.312f, 0.907f)
                close()
                moveTo(17.8f, 7.32f)
                curveToRelative(-2.9f, 1.474f, -3.809f, 1.304f, -6.255f, 1.701f)
                curveToRelative(-2.445f, 0.34f, -4.266f, 0.908f, -6.313f, 3.064f)
                curveToRelative(-0.51f, 0.567f, -0.74f, 1.021f, 0.058f, 0.624f)
                curveToRelative(2.9f, -1.475f, 3.81f, -1.305f, 6.254f, -1.702f)
                curveToRelative(2.446f, -0.34f, 4.267f, -0.907f, 6.314f, -3.064f)
                curveToRelative(0.512f, -0.566f, 0.796f, -1.02f, -0.057f, -0.623f)
                close()
                moveTo(12.74f, 3.178f)
                curveToRelative(-0.966f, -0.454f, -2.218f, 0.17f, -2.786f, 1.419f)
                curveToRelative(-0.569f, 1.19f, -0.228f, 2.553f, 0.74f, 3.007f)
                curveToRelative(0.966f, 0.454f, 2.217f, -0.17f, 2.786f, -1.42f)
                curveToRelative(0.568f, -1.246f, 0.228f, -2.609f, -0.74f, -3.006f)
                close()
            }
        }
        .build()
        return _iledefrancemobilites!!
    }

private var _iledefrancemobilites: ImageVector? = null
