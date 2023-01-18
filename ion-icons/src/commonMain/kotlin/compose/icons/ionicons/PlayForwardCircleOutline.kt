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

public val IonIcons.PlayForwardCircleOutline: ImageVector
    get() {
        if (_playForwardCircleOutline != null) {
            return _playForwardCircleOutline!!
        }
        _playForwardCircleOutline = Builder(name = "PlayForwardCircleOutline", defaultWidth =
                512.0.dp, defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight =
                512.0f).apply {
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
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(394.77f, 246.7f)
                lineTo(280.32f, 177.56f)
                arcTo(10.78f, 10.78f, 0.0f, false, false, 264.0f, 186.87f)
                verticalLineToRelative(53.32f)
                lineTo(160.32f, 177.56f)
                arcTo(10.78f, 10.78f, 0.0f, false, false, 144.0f, 186.87f)
                verticalLineTo(325.13f)
                arcToRelative(10.78f, 10.78f, 0.0f, false, false, 16.32f, 9.31f)
                lineTo(264.0f, 271.81f)
                verticalLineToRelative(53.32f)
                arcToRelative(10.78f, 10.78f, 0.0f, false, false, 16.32f, 9.31f)
                lineTo(394.77f, 265.3f)
                arcTo(10.89f, 10.89f, 0.0f, false, false, 394.77f, 246.7f)
                close()
            }
        }
        .build()
        return _playForwardCircleOutline!!
    }

private var _playForwardCircleOutline: ImageVector? = null