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

public val IonIcons.MapOutline: ImageVector
    get() {
        if (_mapOutline != null) {
            return _mapOutline!!
        }
        _mapOutline = Builder(name = "MapOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(313.27f, 124.64f)
                lineTo(198.73f, 51.36f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -29.28f, 0.35f)
                lineTo(56.51f, 127.49f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 141.63f)
                verticalLineToRelative(295.8f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 23.49f, 14.14f)
                lineToRelative(97.82f, -63.79f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 29.5f, -0.24f)
                lineToRelative(111.86f, 73.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 29.27f, -0.11f)
                lineToRelative(115.43f, -75.94f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 8.63f, -14.2f)
                verticalLineTo(74.57f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -23.49f, -14.14f)
                lineToRelative(-98.0f, 63.86f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 313.27f, 124.64f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(328.0f, 128.0f)
                lineTo(328.0f, 464.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(184.0f, 48.0f)
                lineTo(184.0f, 384.0f)
            }
        }
        .build()
        return _mapOutline!!
    }

private var _mapOutline: ImageVector? = null
