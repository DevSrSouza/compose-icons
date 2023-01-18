package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.LogoAmplify: ImageVector
    get() {
        if (_logoAmplify != null) {
            return _logoAmplify!!
        }
        _logoAmplify = Builder(name = "LogoAmplify", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(112.31f, 268.0f)
                lineToRelative(40.36f, -68.69f)
                lineToRelative(34.65f, 59.0f)
                lineToRelative(-67.54f, 115.0f)
                horizontalLineToRelative(135.0f)
                lineTo(289.31f, 432.0f)
                lineTo(16.0f, 432.0f)
                close()
                moveTo(170.88f, 168.24f)
                lineTo(204.15f, 111.57f)
                lineTo(392.44f, 432.0f)
                lineTo(325.76f, 432.0f)
                close()
                moveTo(222.67f, 80.0f)
                horizontalLineToRelative(66.59f)
                lineTo(496.0f, 432.0f)
                lineTo(429.32f, 432.0f)
                close()
            }
        }
        .build()
        return _logoAmplify!!
    }

private var _logoAmplify: ImageVector? = null
