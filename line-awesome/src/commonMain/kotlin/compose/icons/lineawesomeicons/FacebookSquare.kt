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

public val LineAwesomeIcons.FacebookSquare: ImageVector
    get() {
        if (_facebookSquare != null) {
            return _facebookSquare!!
        }
        _facebookSquare = Builder(name = "FacebookSquare", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 5.0f)
                curveTo(5.906f, 5.0f, 5.0f, 5.906f, 5.0f, 7.0f)
                lineTo(5.0f, 25.0f)
                curveTo(5.0f, 26.094f, 5.906f, 27.0f, 7.0f, 27.0f)
                lineTo(25.0f, 27.0f)
                curveTo(26.094f, 27.0f, 27.0f, 26.094f, 27.0f, 25.0f)
                lineTo(27.0f, 7.0f)
                curveTo(27.0f, 5.906f, 26.094f, 5.0f, 25.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(19.813f, 25.0f)
                lineTo(19.813f, 18.25f)
                lineTo(22.406f, 18.25f)
                lineTo(22.781f, 15.25f)
                lineTo(19.813f, 15.25f)
                lineTo(19.813f, 13.313f)
                curveTo(19.813f, 12.438f, 20.027f, 11.844f, 21.281f, 11.844f)
                lineTo(22.906f, 11.844f)
                lineTo(22.906f, 9.125f)
                curveTo(22.629f, 9.09f, 21.668f, 9.031f, 20.563f, 9.031f)
                curveTo(18.258f, 9.031f, 16.688f, 10.418f, 16.688f, 13.0f)
                lineTo(16.688f, 15.25f)
                lineTo(14.063f, 15.25f)
                lineTo(14.063f, 18.25f)
                lineTo(16.688f, 18.25f)
                lineTo(16.688f, 25.0f)
                lineTo(7.0f, 25.0f)
                close()
            }
        }
        .build()
        return _facebookSquare!!
    }

private var _facebookSquare: ImageVector? = null
