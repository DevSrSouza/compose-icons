package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.WebAssetOff: ImageVector
    get() {
        if (_webAssetOff != null) {
            return _webAssetOff!!
        }
        _webAssetOff = Builder(name = "WebAssetOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.83f, 4.0f)
                horizontalLineTo(20.0f)
                curveToRelative(1.11f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 0.34f, -0.09f, 0.66f, -0.23f, 0.94f)
                lineTo(20.0f, 17.17f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(-9.17f)
                lineTo(6.83f, 4.0f)
                close()
                moveTo(20.49f, 23.31f)
                lineTo(17.17f, 20.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-1.11f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -0.34f, 0.08f, -0.66f, 0.23f, -0.94f)
                lineTo(0.69f, 3.51f)
                lineTo(2.1f, 2.1f)
                lineToRelative(19.8f, 19.8f)
                lineTo(20.49f, 23.31f)
                close()
                moveTo(15.17f, 18.0f)
                lineToRelative(-10.0f, -10.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(10.0f)
                horizontalLineTo(15.17f)
                close()
            }
        }
        .build()
        return _webAssetOff!!
    }

private var _webAssetOff: ImageVector? = null
