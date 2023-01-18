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

public val IonIcons.ArrowRedoCircleOutline: ImageVector
    get() {
        if (_arrowRedoCircleOutline != null) {
            return _arrowRedoCircleOutline!!
        }
        _arrowRedoCircleOutline = Builder(name = "ArrowRedoCircleOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(266.91f, 327.74f)
                verticalLineTo(290.42f)
                curveToRelative(-57.07f, 0.0f, -84.51f, 13.47f, -108.58f, 38.68f)
                curveToRelative(-5.4f, 5.65f, -15.0f, 1.32f, -14.29f, -6.43f)
                curveToRelative(5.45f, -61.45f, 34.14f, -117.09f, 122.87f, -117.09f)
                verticalLineTo(168.26f)
                arcToRelative(8.32f, 8.32f, 0.0f, false, true, 14.0f, -6.0f)
                lineTo(365.42f, 242.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, 0.0f, 11.94f)
                lineTo(281.0f, 333.71f)
                arcTo(8.32f, 8.32f, 0.0f, false, true, 266.91f, 327.74f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(64.0f, 256.0f)
                curveToRelative(0.0f, 106.0f, 86.0f, 192.0f, 192.0f, 192.0f)
                reflectiveCurveToRelative(192.0f, -86.0f, 192.0f, -192.0f)
                reflectiveCurveTo(362.0f, 64.0f, 256.0f, 64.0f)
                reflectiveCurveTo(64.0f, 150.0f, 64.0f, 256.0f)
                close()
            }
        }
        .build()
        return _arrowRedoCircleOutline!!
    }

private var _arrowRedoCircleOutline: ImageVector? = null
