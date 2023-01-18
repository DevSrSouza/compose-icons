package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.ArrowRedoCircle: ImageVector
    get() {
        if (_arrowRedoCircle != null) {
            return _arrowRedoCircle!!
        }
        _arrowRedoCircle = Builder(name = "ArrowRedoCircle", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 256.0f)
                curveToRelative(0.0f, 114.87f, 93.13f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveToRelative(208.0f, -93.13f, 208.0f, -208.0f)
                reflectiveCurveTo(370.87f, 48.0f, 256.0f, 48.0f)
                reflectiveCurveTo(48.0f, 141.13f, 48.0f, 256.0f)
                close()
                moveTo(144.0f, 322.67f)
                curveToRelative(5.45f, -61.45f, 34.14f, -117.09f, 122.87f, -117.09f)
                lineTo(266.87f, 168.26f)
                arcToRelative(8.32f, 8.32f, 0.0f, false, true, 14.0f, -6.0f)
                lineTo(365.42f, 242.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, 0.0f, 11.94f)
                lineTo(281.0f, 333.71f)
                arcToRelative(8.32f, 8.32f, 0.0f, false, true, -14.0f, -6.0f)
                lineTo(267.0f, 290.42f)
                curveToRelative(-57.07f, 0.0f, -84.51f, 13.47f, -108.58f, 38.68f)
                curveTo(152.93f, 334.75f, 143.35f, 330.42f, 144.0f, 322.67f)
                close()
            }
        }
        .build()
        return _arrowRedoCircle!!
    }

private var _arrowRedoCircle: ImageVector? = null
