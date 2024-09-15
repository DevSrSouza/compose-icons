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

public val LineAwesomeIcons.MousePointerSolid: ImageVector
    get() {
        if (_mousePointerSolid != null) {
            return _mousePointerSolid!!
        }
        _mousePointerSolid = Builder(name = "MousePointerSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 2.594f)
                lineTo(9.0f, 28.156f)
                lineTo(10.656f, 26.781f)
                lineTo(14.688f, 23.406f)
                lineTo(16.719f, 27.438f)
                lineTo(17.156f, 28.344f)
                lineTo(18.063f, 27.875f)
                lineTo(21.156f, 26.281f)
                lineTo(22.031f, 25.844f)
                lineTo(21.594f, 24.938f)
                lineTo(19.75f, 21.313f)
                lineTo(24.813f, 20.688f)
                lineTo(26.844f, 20.438f)
                lineTo(25.406f, 19.0f)
                lineTo(10.719f, 4.281f)
                close()
                moveTo(11.0f, 7.438f)
                lineTo(22.563f, 18.969f)
                lineTo(18.063f, 19.5f)
                lineTo(16.656f, 19.688f)
                lineTo(17.313f, 20.969f)
                lineTo(19.375f, 24.969f)
                lineTo(18.063f, 25.656f)
                lineTo(15.906f, 21.344f)
                lineTo(15.313f, 20.219f)
                lineTo(14.344f, 21.031f)
                lineTo(11.0f, 23.844f)
                close()
            }
        }
        .build()
        return _mousePointerSolid!!
    }

private var _mousePointerSolid: ImageVector? = null
