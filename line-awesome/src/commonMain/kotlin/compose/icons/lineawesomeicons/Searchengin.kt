package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Searchengin: ImageVector
    get() {
        if (_searchengin != null) {
            return _searchengin!!
        }
        _searchengin = Builder(name = "Searchengin", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.939f, 4.0f)
                lineTo(12.939f, 6.717f)
                curveTo(15.944f, 6.986f, 17.949f, 9.463f, 17.949f, 12.314f)
                curveTo(17.949f, 14.935f, 16.156f, 17.133f, 13.727f, 17.748f)
                lineTo(12.9f, 20.34f)
                lineTo(12.785f, 20.686f)
                curveTo(14.263f, 20.59f, 15.741f, 20.063f, 17.027f, 19.18f)
                lineTo(17.537f, 19.947f)
                curveTo(18.958f, 20.465f, 20.053f, 21.599f, 20.543f, 22.684f)
                curveTo(21.033f, 23.788f, 21.05f, 24.362f, 22.787f, 25.648f)
                curveTo(24.525f, 26.925f, 25.659f, 27.867f, 25.938f, 27.963f)
                curveTo(26.226f, 28.059f, 26.85f, 28.001f, 27.436f, 27.416f)
                curveTo(28.02f, 26.829f, 28.076f, 26.205f, 27.98f, 25.926f)
                curveTo(27.884f, 25.648f, 26.944f, 24.515f, 25.658f, 22.777f)
                curveTo(24.372f, 21.039f, 23.785f, 21.02f, 22.691f, 20.531f)
                curveTo(21.597f, 20.041f, 20.464f, 18.956f, 19.955f, 17.535f)
                lineTo(19.197f, 17.037f)
                curveTo(20.119f, 15.693f, 20.705f, 14.071f, 20.705f, 12.314f)
                curveTo(20.705f, 7.888f, 17.287f, 4.269f, 12.939f, 4.0f)
                close()
                moveTo(11.172f, 4.068f)
                curveTo(7.121f, 4.634f, 4.0f, 8.119f, 4.0f, 12.314f)
                curveTo(4.0f, 16.538f, 7.005f, 20.069f, 11.066f, 20.617f)
                lineTo(11.066f, 17.824f)
                curveTo(8.503f, 17.316f, 6.717f, 15.04f, 6.717f, 12.314f)
                curveTo(6.717f, 9.923f, 8.204f, 7.887f, 10.316f, 7.072f)
                lineTo(11.104f, 4.318f)
                lineTo(11.172f, 4.068f)
                close()
                moveTo(12.0f, 4.566f)
                lineTo(9.154f, 14.502f)
                lineTo(12.006f, 13.244f)
                lineTo(12.006f, 20.043f)
                lineTo(15.52f, 9.117f)
                lineTo(12.0f, 10.586f)
                lineTo(12.0f, 4.566f)
                close()
                moveTo(26.492f, 26.061f)
                curveTo(26.723f, 26.061f, 26.914f, 26.252f, 26.914f, 26.482f)
                curveTo(26.914f, 26.713f, 26.722f, 26.896f, 26.492f, 26.896f)
                curveTo(26.262f, 26.896f, 26.08f, 26.713f, 26.08f, 26.482f)
                curveTo(26.08f, 26.252f, 26.261f, 26.061f, 26.492f, 26.061f)
                close()
            }
        }
        .build()
        return _searchengin!!
    }

private var _searchengin: ImageVector? = null
