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

public val FilledGroup.PanelLeftContract: ImageVector
    get() {
        if (_panelLeftContract != null) {
            return _panelLeftContract!!
        }
        _panelLeftContract = Builder(name = "PanelLeftContract", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.8075f, 9.2483f)
                curveTo(14.5304f, 8.9404f, 14.0562f, 8.9154f, 13.7483f, 9.1925f)
                lineTo(11.2483f, 11.4425f)
                curveTo(11.0902f, 11.5848f, 11.0f, 11.7874f, 11.0f, 12.0f)
                curveTo(11.0f, 12.2126f, 11.0902f, 12.4152f, 11.2483f, 12.5575f)
                lineTo(13.7483f, 14.8075f)
                curveTo(14.0562f, 15.0846f, 14.5304f, 15.0596f, 14.8075f, 14.7517f)
                curveTo(15.0846f, 14.4438f, 15.0596f, 13.9696f, 14.7517f, 13.6925f)
                lineTo(13.7045f, 12.75f)
                horizontalLineTo(17.25f)
                curveTo(17.6642f, 12.75f, 18.0f, 12.4142f, 18.0f, 12.0f)
                curveTo(18.0f, 11.5858f, 17.6642f, 11.25f, 17.25f, 11.25f)
                horizontalLineTo(13.7045f)
                lineTo(14.7517f, 10.3075f)
                curveTo(15.0596f, 10.0304f, 15.0846f, 9.5562f, 14.8075f, 9.2483f)
                close()
                moveTo(2.0f, 6.75f)
                curveTo(2.0f, 5.2312f, 3.2312f, 4.0f, 4.75f, 4.0f)
                horizontalLineTo(19.25f)
                curveTo(20.7688f, 4.0f, 22.0f, 5.2312f, 22.0f, 6.75f)
                verticalLineTo(17.25f)
                curveTo(22.0f, 18.7688f, 20.7688f, 20.0f, 19.25f, 20.0f)
                horizontalLineTo(4.75f)
                curveTo(3.2312f, 20.0f, 2.0f, 18.7688f, 2.0f, 17.25f)
                verticalLineTo(6.75f)
                close()
                moveTo(8.9983f, 5.5f)
                verticalLineTo(18.5f)
                horizontalLineTo(19.25f)
                curveTo(19.9404f, 18.5f, 20.5f, 17.9404f, 20.5f, 17.25f)
                verticalLineTo(6.75f)
                curveTo(20.5f, 6.0596f, 19.9404f, 5.5f, 19.25f, 5.5f)
                horizontalLineTo(8.9983f)
                close()
            }
        }
        .build()
        return _panelLeftContract!!
    }

private var _panelLeftContract: ImageVector? = null
