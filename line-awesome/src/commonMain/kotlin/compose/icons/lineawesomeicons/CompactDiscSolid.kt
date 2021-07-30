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

public val LineAwesomeIcons.CompactDiscSolid: ImageVector
    get() {
        if (_compactDiscSolid != null) {
            return _compactDiscSolid!!
        }
        _compactDiscSolid = Builder(name = "CompactDiscSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(9.3828f, 4.0f, 4.0f, 9.3828f, 4.0f, 16.0f)
                curveTo(4.0f, 22.6172f, 9.3828f, 28.0f, 16.0f, 28.0f)
                curveTo(22.6172f, 28.0f, 28.0f, 22.6172f, 28.0f, 16.0f)
                curveTo(28.0f, 9.3828f, 22.6172f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(21.5352f, 6.0f, 26.0f, 10.4648f, 26.0f, 16.0f)
                curveTo(26.0f, 21.5352f, 21.5352f, 26.0f, 16.0f, 26.0f)
                curveTo(10.4648f, 26.0f, 6.0f, 21.5352f, 6.0f, 16.0f)
                curveTo(6.0f, 10.4648f, 10.4648f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(13.2188f, 8.5f)
                curveTo(11.043f, 9.3086f, 9.3086f, 11.043f, 8.5f, 13.2188f)
                lineTo(10.375f, 13.9063f)
                curveTo(10.9805f, 12.2773f, 12.2773f, 10.9805f, 13.9063f, 10.375f)
                close()
                moveTo(16.0f, 13.0f)
                curveTo(14.3555f, 13.0f, 13.0f, 14.3555f, 13.0f, 16.0f)
                curveTo(13.0f, 17.6445f, 14.3555f, 19.0f, 16.0f, 19.0f)
                curveTo(17.6445f, 19.0f, 19.0f, 17.6445f, 19.0f, 16.0f)
                curveTo(19.0f, 14.3555f, 17.6445f, 13.0f, 16.0f, 13.0f)
                close()
                moveTo(16.0f, 15.0f)
                curveTo(16.5625f, 15.0f, 17.0f, 15.4375f, 17.0f, 16.0f)
                curveTo(17.0f, 16.5625f, 16.5625f, 17.0f, 16.0f, 17.0f)
                curveTo(15.4375f, 17.0f, 15.0f, 16.5625f, 15.0f, 16.0f)
                curveTo(15.0f, 15.4375f, 15.4375f, 15.0f, 16.0f, 15.0f)
                close()
                moveTo(21.625f, 18.0938f)
                curveTo(21.0195f, 19.7227f, 19.7227f, 21.0195f, 18.0938f, 21.625f)
                lineTo(18.7813f, 23.5f)
                curveTo(20.957f, 22.6914f, 22.6914f, 20.957f, 23.5f, 18.7813f)
                close()
            }
        }
        .build()
        return _compactDiscSolid!!
    }

private var _compactDiscSolid: ImageVector? = null
