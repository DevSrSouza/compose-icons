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

public val IonIcons.StopCircleOutline: ImageVector
    get() {
        if (_stopCircleOutline != null) {
            return _stopCircleOutline!!
        }
        _stopCircleOutline = Builder(name = "StopCircleOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
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
                moveTo(310.4f, 336.0f)
                horizontalLineTo(201.6f)
                arcTo(25.62f, 25.62f, 0.0f, false, true, 176.0f, 310.4f)
                verticalLineTo(201.6f)
                arcTo(25.62f, 25.62f, 0.0f, false, true, 201.6f, 176.0f)
                horizontalLineTo(310.4f)
                arcTo(25.62f, 25.62f, 0.0f, false, true, 336.0f, 201.6f)
                verticalLineTo(310.4f)
                arcTo(25.62f, 25.62f, 0.0f, false, true, 310.4f, 336.0f)
                close()
            }
        }
        .build()
        return _stopCircleOutline!!
    }

private var _stopCircleOutline: ImageVector? = null
