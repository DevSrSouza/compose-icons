package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Eventbrite: ImageVector
    get() {
        if (_eventbrite != null) {
            return _eventbrite!!
        }
        _eventbrite = Builder(name = "Eventbrite", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.673f, 17.438f)
                curveTo(12.306f, 18.542f, 9.586f, 17.968f, 7.854f, 16.204f)
                lineTo(21.865f, 9.671f)
                curveTo(21.711f, 9.03f, 21.49f, 8.394f, 21.201f, 7.774f)
                curveTo(18.867f, 2.768f, 12.917f, 0.603f, 7.912f, 2.937f)
                curveTo(2.906f, 5.271f, 0.741f, 11.221f, 3.075f, 16.226f)
                curveTo(5.409f, 21.232f, 11.358f, 23.397f, 16.364f, 21.063f)
                curveTo(19.016f, 19.826f, 20.871f, 17.575f, 21.681f, 14.986f)
                horizontalLineTo(17.342f)
                curveTo(16.748f, 16.024f, 15.839f, 16.894f, 14.673f, 17.438f)
                close()
                moveTo(9.602f, 6.562f)
                curveTo(7.234f, 7.666f, 5.926f, 10.118f, 6.164f, 12.579f)
                lineTo(16.421f, 7.796f)
                curveTo(14.689f, 6.032f, 11.97f, 5.458f, 9.602f, 6.562f)
                close()
            }
        }
        .build()
        return _eventbrite!!
    }

private var _eventbrite: ImageVector? = null
