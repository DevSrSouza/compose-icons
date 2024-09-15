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

public val LineAwesomeIcons.LifeRingSolid: ImageVector
    get() {
        if (_lifeRingSolid != null) {
            return _lifeRingSolid!!
        }
        _lifeRingSolid = Builder(name = "LifeRingSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(9.383f, 4.0f, 4.0f, 9.383f, 4.0f, 16.0f)
                curveTo(4.0f, 22.617f, 9.383f, 28.0f, 16.0f, 28.0f)
                curveTo(22.617f, 28.0f, 28.0f, 22.617f, 28.0f, 16.0f)
                curveTo(28.0f, 9.383f, 22.617f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(16.336f, 6.0f, 16.672f, 6.031f, 17.0f, 6.063f)
                lineTo(17.0f, 9.094f)
                curveTo(16.672f, 9.047f, 16.34f, 9.0f, 16.0f, 9.0f)
                curveTo(15.66f, 9.0f, 15.328f, 9.047f, 15.0f, 9.094f)
                lineTo(15.0f, 6.063f)
                curveTo(15.328f, 6.031f, 15.664f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(13.0f, 6.438f)
                lineTo(13.0f, 9.688f)
                curveTo(11.547f, 10.383f, 10.379f, 11.547f, 9.688f, 13.0f)
                lineTo(6.469f, 13.0f)
                curveTo(7.441f, 9.875f, 9.883f, 7.414f, 13.0f, 6.438f)
                close()
                moveTo(19.0f, 6.438f)
                curveTo(22.113f, 7.414f, 24.586f, 9.887f, 25.563f, 13.0f)
                lineTo(22.313f, 13.0f)
                curveTo(21.621f, 11.547f, 20.453f, 10.379f, 19.0f, 9.688f)
                close()
                moveTo(16.0f, 11.0f)
                curveTo(18.773f, 11.0f, 21.0f, 13.227f, 21.0f, 16.0f)
                curveTo(21.0f, 18.773f, 18.773f, 21.0f, 16.0f, 21.0f)
                curveTo(13.227f, 21.0f, 11.0f, 18.773f, 11.0f, 16.0f)
                curveTo(11.0f, 13.227f, 13.227f, 11.0f, 16.0f, 11.0f)
                close()
                moveTo(6.063f, 15.0f)
                lineTo(9.063f, 15.0f)
                curveTo(9.016f, 15.324f, 9.0f, 15.664f, 9.0f, 16.0f)
                curveTo(9.0f, 16.34f, 9.047f, 16.672f, 9.094f, 17.0f)
                lineTo(6.063f, 17.0f)
                curveTo(6.031f, 16.672f, 6.0f, 16.336f, 6.0f, 16.0f)
                curveTo(6.0f, 15.664f, 6.031f, 15.328f, 6.063f, 15.0f)
                close()
                moveTo(22.906f, 15.0f)
                lineTo(25.938f, 15.0f)
                curveTo(25.969f, 15.328f, 26.0f, 15.664f, 26.0f, 16.0f)
                curveTo(26.0f, 16.336f, 25.969f, 16.672f, 25.938f, 17.0f)
                lineTo(22.906f, 17.0f)
                curveTo(22.953f, 16.672f, 23.0f, 16.34f, 23.0f, 16.0f)
                curveTo(23.0f, 15.66f, 22.953f, 15.328f, 22.906f, 15.0f)
                close()
                moveTo(6.438f, 19.0f)
                lineTo(9.688f, 19.0f)
                curveTo(10.379f, 20.453f, 11.547f, 21.621f, 13.0f, 22.313f)
                lineTo(13.0f, 25.563f)
                curveTo(9.887f, 24.586f, 7.414f, 22.113f, 6.438f, 19.0f)
                close()
                moveTo(22.313f, 19.0f)
                lineTo(25.563f, 19.0f)
                curveTo(24.586f, 22.113f, 22.113f, 24.586f, 19.0f, 25.563f)
                lineTo(19.0f, 22.313f)
                curveTo(20.453f, 21.621f, 21.621f, 20.453f, 22.313f, 19.0f)
                close()
                moveTo(15.0f, 22.906f)
                curveTo(15.328f, 22.953f, 15.66f, 23.0f, 16.0f, 23.0f)
                curveTo(16.34f, 23.0f, 16.672f, 22.953f, 17.0f, 22.906f)
                lineTo(17.0f, 25.938f)
                curveTo(16.672f, 25.969f, 16.336f, 26.0f, 16.0f, 26.0f)
                curveTo(15.664f, 26.0f, 15.328f, 25.969f, 15.0f, 25.938f)
                close()
            }
        }
        .build()
        return _lifeRingSolid!!
    }

private var _lifeRingSolid: ImageVector? = null
