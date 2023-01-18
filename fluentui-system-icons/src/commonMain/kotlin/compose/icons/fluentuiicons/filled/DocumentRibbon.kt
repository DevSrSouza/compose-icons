package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.DocumentRibbon: ImageVector
    get() {
        if (_documentRibbon != null) {
            return _documentRibbon!!
        }
        _documentRibbon = Builder(name = "DocumentRibbon", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                verticalLineTo(8.0008f)
                curveTo(12.0f, 9.1055f, 12.8954f, 10.001f, 14.0f, 10.001f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0023f)
                curveTo(20.0f, 21.107f, 19.1046f, 22.0026f, 18.0f, 22.0026f)
                horizontalLineTo(9.0f)
                verticalLineTo(18.3308f)
                curveTo(9.6254f, 17.5578f, 10.0f, 16.5735f, 10.0f, 15.5017f)
                curveTo(10.0f, 13.0161f, 7.9853f, 11.0012f, 5.5f, 11.0012f)
                curveTo(4.9741f, 11.0012f, 4.4692f, 11.0914f, 4.0f, 11.2573f)
                verticalLineTo(4.0003f)
                curveTo(4.0f, 2.8956f, 4.8954f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(13.5f, 2.5001f)
                verticalLineTo(8.0008f)
                curveTo(13.5f, 8.2769f, 13.7239f, 8.5008f, 14.0f, 8.5008f)
                horizontalLineTo(19.5f)
                lineTo(13.5f, 2.5001f)
                close()
                moveTo(9.0f, 15.5017f)
                curveTo(9.0f, 17.435f, 7.433f, 19.0022f, 5.5f, 19.0022f)
                curveTo(3.567f, 19.0022f, 2.0f, 17.435f, 2.0f, 15.5017f)
                curveTo(2.0f, 13.5685f, 3.567f, 12.0013f, 5.5f, 12.0013f)
                curveTo(7.433f, 12.0013f, 9.0f, 13.5685f, 9.0f, 15.5017f)
                close()
                moveTo(3.0f, 19.2444f)
                verticalLineTo(22.2885f)
                curveTo(3.0f, 22.9211f, 3.7648f, 23.2379f, 4.212f, 22.7906f)
                lineTo(5.5f, 21.5025f)
                lineTo(6.788f, 22.7906f)
                curveTo(7.2352f, 23.2379f, 8.0f, 22.9211f, 8.0f, 22.2885f)
                verticalLineTo(19.2444f)
                curveTo(7.2849f, 19.7231f, 6.4251f, 20.0023f, 5.5f, 20.0023f)
                curveTo(4.5749f, 20.0023f, 3.715f, 19.7231f, 3.0f, 19.2444f)
                close()
            }
        }
        .build()
        return _documentRibbon!!
    }

private var _documentRibbon: ImageVector? = null
