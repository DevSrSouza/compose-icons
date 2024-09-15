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

public val LineAwesomeIcons.AngrySolid: ImageVector
    get() {
        if (_angrySolid != null) {
            return _angrySolid!!
        }
        _angrySolid = Builder(name = "AngrySolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
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
                curveTo(21.535f, 6.0f, 26.0f, 10.465f, 26.0f, 16.0f)
                curveTo(26.0f, 21.535f, 21.535f, 26.0f, 16.0f, 26.0f)
                curveTo(10.465f, 26.0f, 6.0f, 21.535f, 6.0f, 16.0f)
                curveTo(6.0f, 10.465f, 10.465f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(10.688f, 12.0f)
                curveTo(10.266f, 12.426f, 10.0f, 13.008f, 10.0f, 13.656f)
                curveTo(10.0f, 14.949f, 11.051f, 16.0f, 12.344f, 16.0f)
                curveTo(12.988f, 16.0f, 13.578f, 15.738f, 14.0f, 15.313f)
                close()
                moveTo(21.313f, 12.0f)
                lineTo(18.0f, 15.313f)
                curveTo(18.422f, 15.738f, 19.012f, 16.0f, 19.656f, 16.0f)
                curveTo(20.949f, 16.0f, 22.0f, 14.949f, 22.0f, 13.656f)
                curveTo(22.0f, 13.012f, 21.738f, 12.422f, 21.313f, 12.0f)
                close()
                moveTo(18.563f, 17.844f)
                curveTo(18.418f, 17.848f, 18.266f, 17.855f, 18.125f, 17.875f)
                curveTo(17.004f, 18.043f, 16.156f, 18.656f, 15.406f, 19.156f)
                curveTo(14.656f, 19.656f, 13.996f, 20.047f, 13.5f, 20.125f)
                curveTo(13.004f, 20.203f, 12.559f, 20.125f, 11.719f, 19.281f)
                lineTo(10.281f, 20.719f)
                curveTo(11.414f, 21.859f, 12.703f, 22.27f, 13.813f, 22.094f)
                curveTo(14.922f, 21.918f, 15.754f, 21.309f, 16.5f, 20.813f)
                curveTo(17.246f, 20.316f, 17.887f, 19.953f, 18.406f, 19.875f)
                curveTo(18.926f, 19.797f, 19.438f, 19.863f, 20.313f, 20.719f)
                lineTo(21.688f, 19.281f)
                curveTo(20.664f, 18.281f, 19.574f, 17.828f, 18.563f, 17.844f)
                close()
            }
        }
        .build()
        return _angrySolid!!
    }

private var _angrySolid: ImageVector? = null
