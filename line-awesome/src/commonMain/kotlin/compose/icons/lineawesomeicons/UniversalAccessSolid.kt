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

public val LineAwesomeIcons.UniversalAccessSolid: ImageVector
    get() {
        if (_universalAccessSolid != null) {
            return _universalAccessSolid!!
        }
        _universalAccessSolid = Builder(name = "UniversalAccessSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
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
                moveTo(16.0f, 8.0f)
                curveTo(14.8945f, 8.0f, 14.0f, 8.8945f, 14.0f, 10.0f)
                curveTo(14.0f, 11.1055f, 14.8945f, 12.0f, 16.0f, 12.0f)
                curveTo(17.1055f, 12.0f, 18.0f, 11.1055f, 18.0f, 10.0f)
                curveTo(18.0f, 8.8945f, 17.1055f, 8.0f, 16.0f, 8.0f)
                close()
                moveTo(10.2188f, 12.0313f)
                lineTo(9.7813f, 13.9688f)
                lineTo(14.0f, 14.9063f)
                lineTo(14.0f, 19.0f)
                lineTo(13.0313f, 23.8125f)
                lineTo(14.9688f, 24.1875f)
                lineTo(15.9688f, 19.1875f)
                lineTo(16.0f, 19.0938f)
                lineTo(16.0313f, 19.1875f)
                lineTo(17.0313f, 24.1875f)
                lineTo(18.9688f, 23.8125f)
                lineTo(18.0f, 19.0f)
                lineTo(18.0f, 14.9063f)
                lineTo(22.2188f, 13.9688f)
                lineTo(21.7813f, 12.0313f)
                lineTo(17.5f, 13.0f)
                lineTo(14.5f, 13.0f)
                close()
            }
        }
        .build()
        return _universalAccessSolid!!
    }

private var _universalAccessSolid: ImageVector? = null
