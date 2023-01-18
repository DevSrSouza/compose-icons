package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.PintOutline: ImageVector
    get() {
        if (_pintOutline != null) {
            return _pintOutline!!
        }
        _pintOutline = Builder(name = "PintOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(132.43f, 162.0f)
                curveToRelative(-6.24f, -34.0f, -4.49f, -45.55f, -3.07f, -68.39f)
                lineTo(132.27f, 47.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 15.94f, -15.0f)
                horizontalLineTo(363.78f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 15.94f, 15.0f)
                lineToRelative(2.91f, 46.61f)
                curveToRelative(1.43f, 22.86f, 3.19f, 34.39f, -3.06f, 68.45f)
                curveToRelative(-5.93f, 32.29f, -43.71f, 133.27f, -43.71f, 238.32f)
                verticalLineTo(472.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(184.12f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(400.37f)
                curveTo(176.13f, 307.9f, 138.66f, 196.07f, 132.43f, 162.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(135.21f, 96.0f)
                lineTo(376.79f, 96.0f)
            }
        }
        .build()
        return _pintOutline!!
    }

private var _pintOutline: ImageVector? = null
