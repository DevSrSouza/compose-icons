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

public val LineAwesomeIcons.CutSolid: ImageVector
    get() {
        if (_cutSolid != null) {
            return _cutSolid!!
        }
        _cutSolid = Builder(name = "CutSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.656f, 4.313f)
                curveTo(18.883f, 4.406f, 18.195f, 4.953f, 17.969f, 5.75f)
                lineTo(15.313f, 15.063f)
                lineTo(11.969f, 16.031f)
                curveTo(11.73f, 14.336f, 10.258f, 13.0f, 8.5f, 13.0f)
                curveTo(6.578f, 13.0f, 5.0f, 14.578f, 5.0f, 16.5f)
                curveTo(5.0f, 18.422f, 6.578f, 20.0f, 8.5f, 20.0f)
                curveTo(9.789f, 20.0f, 10.926f, 19.27f, 11.531f, 18.219f)
                lineTo(14.656f, 17.344f)
                lineTo(13.781f, 20.469f)
                curveTo(12.73f, 21.074f, 12.0f, 22.211f, 12.0f, 23.5f)
                curveTo(12.0f, 25.422f, 13.578f, 27.0f, 15.5f, 27.0f)
                curveTo(17.422f, 27.0f, 19.0f, 25.422f, 19.0f, 23.5f)
                curveTo(19.0f, 21.742f, 17.664f, 20.27f, 15.969f, 20.031f)
                lineTo(20.438f, 4.375f)
                curveTo(20.172f, 4.301f, 19.914f, 4.281f, 19.656f, 4.313f)
                close()
                moveTo(27.625f, 11.563f)
                lineTo(18.906f, 14.031f)
                lineTo(18.25f, 16.313f)
                lineTo(26.25f, 14.031f)
                curveTo(27.313f, 13.727f, 27.93f, 12.625f, 27.625f, 11.563f)
                close()
                moveTo(8.5f, 15.0f)
                curveTo(9.34f, 15.0f, 10.0f, 15.66f, 10.0f, 16.5f)
                curveTo(10.0f, 17.34f, 9.34f, 18.0f, 8.5f, 18.0f)
                curveTo(7.66f, 18.0f, 7.0f, 17.34f, 7.0f, 16.5f)
                curveTo(7.0f, 15.66f, 7.66f, 15.0f, 8.5f, 15.0f)
                close()
                moveTo(15.5f, 22.0f)
                curveTo(16.34f, 22.0f, 17.0f, 22.66f, 17.0f, 23.5f)
                curveTo(17.0f, 24.34f, 16.34f, 25.0f, 15.5f, 25.0f)
                curveTo(14.66f, 25.0f, 14.0f, 24.34f, 14.0f, 23.5f)
                curveTo(14.0f, 22.66f, 14.66f, 22.0f, 15.5f, 22.0f)
                close()
            }
        }
        .build()
        return _cutSolid!!
    }

private var _cutSolid: ImageVector? = null
