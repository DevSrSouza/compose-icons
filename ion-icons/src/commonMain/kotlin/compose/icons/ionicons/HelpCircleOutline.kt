package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.HelpCircleOutline: ImageVector
    get() {
        if (_helpCircleOutline != null) {
            return _helpCircleOutline!!
        }
        _helpCircleOutline = Builder(name = "HelpCircleOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 80.0f)
                arcTo(176.0f, 176.0f, 0.0f, true, false, 432.0f, 256.0f)
                arcTo(176.0f, 176.0f, 0.0f, false, false, 256.0f, 80.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 28.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(200.0f, 202.29f)
                reflectiveCurveToRelative(0.84f, -17.5f, 19.57f, -32.57f)
                curveTo(230.68f, 160.77f, 244.0f, 158.18f, 256.0f, 158.0f)
                curveToRelative(10.93f, -0.14f, 20.69f, 1.67f, 26.53f, 4.45f)
                curveToRelative(10.0f, 4.76f, 29.47f, 16.38f, 29.47f, 41.09f)
                curveToRelative(0.0f, 26.0f, -17.0f, 37.81f, -36.37f, 50.8f)
                reflectiveCurveTo(251.0f, 281.43f, 251.0f, 296.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(250.0f, 348.0f)
                moveToRelative(-20.0f, 0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 40.0f, 0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -40.0f, 0.0f)
            }
        }
        .build()
        return _helpCircleOutline!!
    }

private var _helpCircleOutline: ImageVector? = null
