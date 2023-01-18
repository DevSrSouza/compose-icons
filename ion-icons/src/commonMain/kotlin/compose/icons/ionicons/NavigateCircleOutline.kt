package compose.icons.ionicons

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
import compose.icons.IonIcons

public val IonIcons.NavigateCircleOutline: ImageVector
    get() {
        if (_navigateCircleOutline != null) {
            return _navigateCircleOutline!!
        }
        _navigateCircleOutline = Builder(name = "NavigateCircleOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(336.76f, 161.0f)
                lineTo(150.23f, 243.35f)
                curveToRelative(-10.47f, 4.8f, -6.95f, 20.67f, 4.57f, 20.67f)
                horizontalLineTo(244.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineTo(357.2f)
                curveToRelative(0.0f, 11.52f, 16.0f, 15.0f, 20.78f, 4.56f)
                lineTo(351.0f, 175.24f)
                arcTo(10.73f, 10.73f, 0.0f, false, false, 336.76f, 161.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(448.0f, 256.0f)
                curveToRelative(0.0f, -106.0f, -86.0f, -192.0f, -192.0f, -192.0f)
                reflectiveCurveTo(64.0f, 150.0f, 64.0f, 256.0f)
                reflectiveCurveToRelative(86.0f, 192.0f, 192.0f, 192.0f)
                reflectiveCurveTo(448.0f, 362.0f, 448.0f, 256.0f)
                close()
            }
        }
        .build()
        return _navigateCircleOutline!!
    }

private var _navigateCircleOutline: ImageVector? = null
