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

public val LineAwesomeIcons.Imdb: ImageVector
    get() {
        if (_imdb != null) {
            return _imdb!!
        }
        _imdb = Builder(name = "Imdb", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 7.0f)
                lineTo(0.0f, 25.0f)
                lineTo(32.0f, 25.0f)
                lineTo(32.0f, 7.0f)
                close()
                moveTo(2.0f, 9.0f)
                lineTo(30.0f, 9.0f)
                lineTo(30.0f, 23.0f)
                lineTo(2.0f, 23.0f)
                close()
                moveTo(5.0f, 11.688f)
                lineTo(5.0f, 20.313f)
                lineTo(7.0f, 20.313f)
                lineTo(7.0f, 11.688f)
                close()
                moveTo(8.094f, 11.688f)
                lineTo(8.094f, 20.313f)
                lineTo(10.0f, 20.313f)
                lineTo(10.0f, 15.5f)
                lineTo(10.906f, 20.313f)
                lineTo(12.188f, 20.313f)
                lineTo(13.0f, 15.5f)
                lineTo(13.0f, 20.313f)
                lineTo(14.813f, 20.313f)
                lineTo(14.813f, 11.688f)
                lineTo(12.0f, 11.688f)
                lineTo(11.5f, 15.813f)
                lineTo(10.813f, 11.688f)
                close()
                moveTo(15.906f, 11.688f)
                lineTo(15.906f, 20.188f)
                lineTo(18.313f, 20.188f)
                curveTo(19.613f, 20.188f, 20.102f, 19.988f, 20.5f, 19.688f)
                curveTo(20.898f, 19.488f, 21.094f, 19.0f, 21.094f, 18.5f)
                lineTo(21.094f, 13.313f)
                curveTo(21.094f, 12.711f, 20.898f, 12.199f, 20.5f, 12.0f)
                curveTo(20.0f, 11.801f, 19.813f, 11.688f, 18.313f, 11.688f)
                close()
                moveTo(22.094f, 11.813f)
                lineTo(22.094f, 20.313f)
                lineTo(23.906f, 20.313f)
                curveTo(23.906f, 20.313f, 23.992f, 19.711f, 24.094f, 19.813f)
                curveTo(24.293f, 19.813f, 25.102f, 20.188f, 25.5f, 20.188f)
                curveTo(26.0f, 20.188f, 26.199f, 20.195f, 26.5f, 20.094f)
                curveTo(26.898f, 19.895f, 27.0f, 19.613f, 27.0f, 19.313f)
                lineTo(27.0f, 14.313f)
                curveTo(27.0f, 13.613f, 26.289f, 13.094f, 25.688f, 13.094f)
                curveTo(25.086f, 13.094f, 24.512f, 13.488f, 24.313f, 13.688f)
                lineTo(24.313f, 11.813f)
                close()
                moveTo(18.0f, 13.0f)
                curveTo(18.398f, 13.0f, 18.813f, 13.008f, 18.813f, 13.406f)
                lineTo(18.813f, 18.406f)
                curveTo(18.813f, 18.805f, 18.301f, 18.813f, 18.0f, 18.813f)
                close()
                moveTo(24.594f, 14.0f)
                curveTo(24.695f, 14.0f, 24.813f, 14.105f, 24.813f, 14.406f)
                lineTo(24.813f, 18.688f)
                curveTo(24.813f, 18.887f, 24.793f, 19.094f, 24.594f, 19.094f)
                curveTo(24.492f, 19.094f, 24.406f, 18.988f, 24.406f, 18.688f)
                lineTo(24.406f, 14.406f)
                curveTo(24.406f, 14.207f, 24.395f, 14.0f, 24.594f, 14.0f)
                close()
            }
        }
        .build()
        return _imdb!!
    }

private var _imdb: ImageVector? = null
