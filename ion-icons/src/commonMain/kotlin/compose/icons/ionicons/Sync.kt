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

public val IonIcons.Sync: ImageVector
    get() {
        if (_sync != null) {
            return _sync!!
        }
        _sync = Builder(name = "Sync", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(434.67f, 285.59f)
                verticalLineToRelative(-29.8f)
                curveTo(434.67f, 157.06f, 354.43f, 77.0f, 255.47f, 77.0f)
                arcToRelative(179.0f, 179.0f, 0.0f, false, false, -140.14f, 67.36f)
                moveToRelative(-38.53f, 82.0f)
                verticalLineToRelative(29.8f)
                curveTo(76.8f, 355.0f, 157.0f, 435.0f, 256.0f, 435.0f)
                arcToRelative(180.45f, 180.45f, 0.0f, false, false, 140.0f, -66.92f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 256.0f)
                lineToRelative(44.0f, -44.0f)
                lineToRelative(46.0f, 44.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(480.0f, 256.0f)
                lineToRelative(-44.0f, 44.0f)
                lineToRelative(-46.0f, -44.0f)
            }
        }
        .build()
        return _sync!!
    }

private var _sync: ImageVector? = null
