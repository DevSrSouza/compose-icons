package compose.icons.feathericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.FeatherIcons

public val FeatherIcons.Gitlab: ImageVector
    get() {
        if (_gitlab != null) {
            return _gitlab!!
        }
        _gitlab = Builder(name = "Gitlab", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.65f, 14.39f)
                lineTo(12.0f, 22.13f)
                lineTo(1.35f, 14.39f)
                arcToRelative(0.84f, 0.84f, 0.0f, false, true, -0.3f, -0.94f)
                lineToRelative(1.22f, -3.78f)
                lineToRelative(2.44f, -7.51f)
                arcTo(0.42f, 0.42f, 0.0f, false, true, 4.82f, 2.0f)
                arcToRelative(0.43f, 0.43f, 0.0f, false, true, 0.58f, 0.0f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, true, 0.11f, 0.18f)
                lineToRelative(2.44f, 7.49f)
                horizontalLineToRelative(8.1f)
                lineToRelative(2.44f, -7.51f)
                arcTo(0.42f, 0.42f, 0.0f, false, true, 18.6f, 2.0f)
                arcToRelative(0.43f, 0.43f, 0.0f, false, true, 0.58f, 0.0f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, true, 0.11f, 0.18f)
                lineToRelative(2.44f, 7.51f)
                lineTo(23.0f, 13.45f)
                arcToRelative(0.84f, 0.84f, 0.0f, false, true, -0.35f, 0.94f)
                close()
            }
        }
        .build()
        return _gitlab!!
    }

private var _gitlab: ImageVector? = null
