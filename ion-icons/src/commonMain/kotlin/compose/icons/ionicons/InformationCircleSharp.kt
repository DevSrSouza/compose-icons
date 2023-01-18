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

public val IonIcons.InformationCircleSharp: ImageVector
    get() {
        if (_informationCircleSharp != null) {
            return _informationCircleSharp!!
        }
        _informationCircleSharp = Builder(name = "InformationCircleSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 56.0f)
                curveTo(145.72f, 56.0f, 56.0f, 145.72f, 56.0f, 256.0f)
                reflectiveCurveToRelative(89.72f, 200.0f, 200.0f, 200.0f)
                reflectiveCurveToRelative(200.0f, -89.72f, 200.0f, -200.0f)
                reflectiveCurveTo(366.28f, 56.0f, 256.0f, 56.0f)
                close()
                moveTo(256.0f, 138.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, -26.0f, 26.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 256.0f, 138.0f)
                close()
                moveTo(320.0f, 364.0f)
                lineTo(200.0f, 364.0f)
                lineTo(200.0f, 332.0f)
                horizontalLineToRelative(44.0f)
                lineTo(244.0f, 244.0f)
                lineTo(212.0f, 244.0f)
                lineTo(212.0f, 212.0f)
                horizontalLineToRelative(64.0f)
                lineTo(276.0f, 332.0f)
                horizontalLineToRelative(44.0f)
                close()
            }
        }
        .build()
        return _informationCircleSharp!!
    }

private var _informationCircleSharp: ImageVector? = null
