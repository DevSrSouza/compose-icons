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

public val IonIcons.Checkbox: ImageVector
    get() {
        if (_checkbox != null) {
            return _checkbox!!
        }
        _checkbox = Builder(name = "Checkbox", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.0f, 48.0f)
                horizontalLineTo(112.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, -64.0f, 64.0f)
                verticalLineTo(400.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, 64.0f, 64.0f)
                horizontalLineTo(400.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, 64.0f, -64.0f)
                verticalLineTo(112.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, false, 400.0f, 48.0f)
                close()
                moveTo(364.25f, 186.29f)
                lineToRelative(-134.4f, 160.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -12.0f, 5.71f)
                horizontalLineToRelative(-0.27f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -11.89f, -5.3f)
                lineToRelative(-57.6f, -64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 23.78f, -21.4f)
                lineToRelative(45.29f, 50.32f)
                lineTo(339.75f, 165.71f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 24.5f, 20.58f)
                close()
            }
        }
        .build()
        return _checkbox!!
    }

private var _checkbox: ImageVector? = null
