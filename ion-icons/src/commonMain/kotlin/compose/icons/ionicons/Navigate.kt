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

public val IonIcons.Navigate: ImageVector
    get() {
        if (_navigate != null) {
            return _navigate!!
        }
        _navigate = Builder(name = "Navigate", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(272.0f, 464.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.42f)
                verticalLineTo(264.13f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                horizontalLineTo(64.41f)
                arcToRelative(16.31f, 16.31f, 0.0f, false, true, -15.49f, -10.65f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 8.41f, -19.87f)
                lineToRelative(384.0f, -176.15f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 21.22f, 21.19f)
                lineToRelative(-176.0f, 384.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 272.0f, 464.0f)
                close()
            }
        }
        .build()
        return _navigate!!
    }

private var _navigate: ImageVector? = null
