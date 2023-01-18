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

public val IonIcons.Card: ImageVector
    get() {
        if (_card != null) {
            return _card!!
        }
        _card = Builder(name = "Card", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 376.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 56.0f, 56.0f)
                lineTo(424.0f, 432.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 56.0f, -56.0f)
                lineTo(480.0f, 222.0f)
                lineTo(32.0f, 222.0f)
                close()
                moveTo(98.0f, 300.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, 30.0f, -30.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, 30.0f, 30.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, -30.0f, 30.0f)
                lineTo(128.0f, 350.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, -30.0f, -30.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(424.0f, 80.0f)
                horizontalLineTo(88.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, -56.0f, 56.0f)
                verticalLineToRelative(26.0f)
                horizontalLineTo(480.0f)
                verticalLineTo(136.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 424.0f, 80.0f)
                close()
            }
        }
        .build()
        return _card!!
    }

private var _card: ImageVector? = null
