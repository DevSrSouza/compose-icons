package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.SendTimeExtension: ImageVector
    get() {
        if (_sendTimeExtension != null) {
            return _sendTimeExtension!!
        }
        _sendTimeExtension = Builder(name = "SendTimeExtension", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 6.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveTo(9.0f, 2.62f, 9.0f, 4.0f)
                horizontalLineTo(5.01f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(3.8f)
                curveTo(5.7f, 9.8f, 6.0f, 11.96f, 6.0f, 12.5f)
                curveToRelative(0.0f, 0.54f, -0.29f, 2.7f, -3.0f, 2.7f)
                verticalLineTo(19.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(3.8f)
                curveToRelative(0.0f, -2.16f, 1.37f, -2.78f, 2.2f, -2.94f)
                verticalLineToRelative(-9.3f)
                lineToRelative(9.0f, 4.5f)
                verticalLineTo(6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 12.0f)
                lineToRelative(0.0f, 4.0f)
                lineToRelative(4.0f, 1.0f)
                lineToRelative(-4.0f, 1.0f)
                lineToRelative(0.0f, 4.0f)
                lineToRelative(10.0f, -5.0f)
                close()
            }
        }
        .build()
        return _sendTimeExtension!!
    }

private var _sendTimeExtension: ImageVector? = null
