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

public val LineAwesomeIcons.Quora: ImageVector
    get() {
        if (_quora != null) {
            return _quora!!
        }
        _quora = Builder(name = "Quora", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.4922f, 4.0f)
                curveTo(10.2012f, 4.0f, 5.0f, 8.2305f, 5.0f, 14.4395f)
                curveTo(5.0f, 21.5565f, 11.9688f, 26.1987f, 18.2148f, 24.4688f)
                curveTo(19.2608f, 26.2518f, 20.6386f, 28.0f, 23.2656f, 28.0f)
                curveTo(27.6066f, 28.0f, 28.0f, 24.0f, 28.0f, 23.0f)
                lineTo(26.4453f, 23.0f)
                curveTo(26.3653f, 23.716f, 25.8776f, 24.457f, 24.6836f, 24.457f)
                curveTo(23.5956f, 24.457f, 22.8106f, 23.7046f, 22.0566f, 22.5586f)
                curveTo(24.4026f, 20.7436f, 25.9492f, 17.9135f, 25.9492f, 14.4375f)
                curveTo(25.9542f, 8.2025f, 20.8942f, 4.0f, 15.4922f, 4.0f)
                close()
                moveTo(15.4922f, 6.0f)
                curveTo(19.5362f, 6.0f, 21.2617f, 8.9095f, 21.2617f, 14.4395f)
                curveTo(21.2667f, 16.6575f, 20.973f, 18.4505f, 20.373f, 19.7715f)
                curveTo(19.338f, 18.2215f, 18.0546f, 17.002f, 15.5176f, 17.002f)
                curveTo(13.8986f, 17.002f, 12.7927f, 17.4733f, 12.0117f, 18.1523f)
                lineTo(12.6582f, 19.4434f)
                curveTo(12.9872f, 19.2844f, 13.1937f, 19.2891f, 13.5547f, 19.2891f)
                curveTo(15.4387f, 19.2891f, 16.4046f, 20.925f, 17.2266f, 22.543f)
                curveTo(16.6956f, 22.702f, 16.1262f, 22.7656f, 15.4902f, 22.7656f)
                curveTo(11.5102f, 22.7656f, 9.7852f, 19.9522f, 9.7852f, 14.4492f)
                curveTo(9.7862f, 8.9082f, 11.5122f, 6.0f, 15.4922f, 6.0f)
                close()
            }
        }
        .build()
        return _quora!!
    }

private var _quora: ImageVector? = null
