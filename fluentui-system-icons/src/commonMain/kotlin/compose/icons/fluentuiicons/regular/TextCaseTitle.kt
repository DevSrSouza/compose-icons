package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.TextCaseTitle: ImageVector
    get() {
        if (_textCaseTitle != null) {
            return _textCaseTitle!!
        }
        _textCaseTitle = Builder(name = "TextCaseTitle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.75f, 3.0f)
                curveTo(15.3358f, 3.0f, 15.0f, 3.3358f, 15.0f, 3.75f)
                verticalLineTo(19.25f)
                curveTo(15.0f, 19.6642f, 15.3358f, 20.0f, 15.75f, 20.0f)
                curveTo(16.1642f, 20.0f, 16.5f, 19.6642f, 16.5f, 19.25f)
                verticalLineTo(19.013f)
                curveTo(17.1848f, 19.6306f, 18.0541f, 20.0f, 19.0f, 20.0f)
                curveTo(21.2091f, 20.0f, 23.0f, 17.9853f, 23.0f, 15.5f)
                curveTo(23.0f, 13.0147f, 21.2091f, 11.0f, 19.0f, 11.0f)
                curveTo(18.0541f, 11.0f, 17.1848f, 11.3694f, 16.5f, 11.987f)
                verticalLineTo(3.75f)
                curveTo(16.5f, 3.3358f, 16.1642f, 3.0f, 15.75f, 3.0f)
                close()
                moveTo(16.5f, 15.5f)
                curveTo(16.5f, 13.6722f, 17.7805f, 12.5f, 19.0f, 12.5f)
                curveTo(20.2195f, 12.5f, 21.5f, 13.6722f, 21.5f, 15.5f)
                curveTo(21.5f, 17.3278f, 20.2195f, 18.5f, 19.0f, 18.5f)
                curveTo(17.7805f, 18.5f, 16.5f, 17.3278f, 16.5f, 15.5f)
                close()
                moveTo(7.7608f, 3.0001f)
                curveTo(8.0744f, 3.0045f, 8.3521f, 3.2036f, 8.457f, 3.4992f)
                lineTo(13.957f, 18.9992f)
                curveTo(14.0955f, 19.3896f, 13.8914f, 19.8183f, 13.501f, 19.9568f)
                curveTo(13.1106f, 20.0953f, 12.6819f, 19.8912f, 12.5434f, 19.5008f)
                lineTo(11.1237f, 15.5f)
                lineTo(4.0061f, 15.5f)
                lineTo(2.4496f, 19.5207f)
                curveTo(2.3001f, 19.907f, 1.8657f, 20.099f, 1.4795f, 19.9494f)
                curveTo(1.0932f, 19.7999f, 0.9012f, 19.3655f, 1.0508f, 18.9793f)
                lineTo(7.0508f, 3.4792f)
                curveTo(7.164f, 3.1868f, 7.4472f, 2.9956f, 7.7608f, 3.0001f)
                close()
                moveTo(7.7196f, 5.9066f)
                lineTo(4.5867f, 14.0f)
                lineTo(10.5915f, 14.0f)
                lineTo(7.7196f, 5.9066f)
                close()
            }
        }
        .build()
        return _textCaseTitle!!
    }

private var _textCaseTitle: ImageVector? = null
