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

public val LineAwesomeIcons.BongSolid: ImageVector
    get() {
        if (_bongSolid != null) {
            return _bongSolid!!
        }
        _bongSolid = Builder(name = "BongSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                lineTo(12.0f, 6.0f)
                lineTo(20.0f, 6.0f)
                lineTo(20.0f, 4.0f)
                lineTo(12.0f, 4.0f)
                close()
                moveTo(13.0f, 7.0f)
                lineTo(13.0f, 14.6777f)
                curveTo(10.0911f, 15.8754f, 8.0f, 18.6608f, 8.0f, 22.0f)
                curveTo(8.0f, 24.2355f, 8.9252f, 26.2757f, 10.4141f, 27.7188f)
                lineTo(10.7051f, 28.0f)
                lineTo(21.2949f, 28.0f)
                lineTo(21.5859f, 27.7188f)
                curveTo(23.0748f, 26.2757f, 24.0f, 24.2355f, 24.0f, 22.0f)
                curveTo(24.0f, 20.5471f, 23.5311f, 19.2353f, 22.8535f, 18.0605f)
                lineTo(24.7676f, 16.1465f)
                lineTo(25.4746f, 16.8535f)
                lineTo(26.8887f, 15.4395f)
                lineTo(24.0605f, 12.6113f)
                lineTo(22.6465f, 14.0254f)
                lineTo(23.3535f, 14.7324f)
                lineTo(21.6328f, 16.4531f)
                curveTo(20.8828f, 15.6919f, 20.0039f, 15.0911f, 19.0f, 14.6777f)
                lineTo(19.0f, 7.0f)
                lineTo(17.0f, 7.0f)
                lineTo(17.0f, 16.0352f)
                lineTo(17.7148f, 16.248f)
                curveTo(19.5525f, 16.7949f, 21.0145f, 18.1968f, 21.6504f, 20.0f)
                lineTo(10.3496f, 20.0f)
                curveTo(10.9855f, 18.1968f, 12.4475f, 16.7949f, 14.2852f, 16.248f)
                lineTo(15.0f, 16.0352f)
                lineTo(15.0f, 7.0f)
                lineTo(13.0f, 7.0f)
                close()
                moveTo(10.0f, 22.0f)
                lineTo(22.0f, 22.0f)
                curveTo(22.0f, 23.5608f, 21.3582f, 24.9432f, 20.3867f, 26.0f)
                lineTo(11.6133f, 26.0f)
                curveTo(10.6418f, 24.9432f, 10.0f, 23.5608f, 10.0f, 22.0f)
                close()
            }
        }
        .build()
        return _bongSolid!!
    }

private var _bongSolid: ImageVector? = null
