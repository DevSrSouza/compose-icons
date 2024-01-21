package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Rasa: ImageVector
    get() {
        if (_rasa != null) {
            return _rasa!!
        }
        _rasa = Builder(name = "Rasa", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.848f, 15.852f)
                lineToRelative(-3.882f, -2.034f)
                lineTo(0.97f, 13.818f)
                lineTo(0.97f, 7.515f)
                horizontalLineToRelative(22.06f)
                verticalLineToRelative(6.303f)
                horizontalLineToRelative(-2.182f)
                verticalLineToRelative(2.034f)
                close()
                moveTo(0.0f, 6.545f)
                verticalLineToRelative(8.243f)
                horizontalLineToRelative(16.727f)
                lineToRelative(5.091f, 2.667f)
                verticalLineToRelative(-2.667f)
                lineTo(24.0f, 14.788f)
                lineTo(24.0f, 6.545f)
                lineTo(0.0f, 6.545f)
                close()
                moveTo(1.94f, 8.485f)
                horizontalLineToRelative(4.12f)
                verticalLineToRelative(2.18f)
                lineToRelative(-1.33f, 0.517f)
                lineToRelative(1.362f, 1.666f)
                lineTo(4.84f, 12.848f)
                lineToRelative(-1.06f, -1.296f)
                lineToRelative(-0.87f, 0.339f)
                verticalLineToRelative(0.957f)
                horizontalLineToRelative(-0.97f)
                lineTo(1.94f, 8.485f)
                close()
                moveTo(8.0f, 12.848f)
                horizontalLineToRelative(-0.97f)
                lineTo(7.03f, 8.485f)
                horizontalLineToRelative(4.364f)
                verticalLineToRelative(4.363f)
                horizontalLineToRelative(-0.97f)
                verticalLineToRelative(-1.454f)
                lineTo(8.0f, 11.394f)
                verticalLineToRelative(1.454f)
                close()
                moveTo(12.364f, 11.152f)
                lineTo(12.364f, 8.485f)
                horizontalLineToRelative(4.363f)
                verticalLineToRelative(0.97f)
                horizontalLineToRelative(-3.394f)
                verticalLineToRelative(0.727f)
                horizontalLineToRelative(3.394f)
                verticalLineToRelative(2.666f)
                horizontalLineToRelative(-4.363f)
                verticalLineToRelative(-0.97f)
                horizontalLineToRelative(3.394f)
                verticalLineToRelative(-0.726f)
                horizontalLineToRelative(-3.394f)
                close()
                moveTo(17.697f, 10.909f)
                lineTo(17.697f, 8.485f)
                horizontalLineToRelative(4.364f)
                verticalLineToRelative(4.363f)
                horizontalLineToRelative(-0.97f)
                verticalLineToRelative(-1.454f)
                horizontalLineToRelative(-2.424f)
                verticalLineToRelative(1.454f)
                horizontalLineToRelative(-0.97f)
                lineTo(17.697f, 10.91f)
                close()
                moveTo(2.909f, 10.849f)
                lineTo(5.091f, 10.001f)
                verticalLineToRelative(-0.546f)
                lineTo(2.909f, 9.455f)
                verticalLineToRelative(1.395f)
                close()
                moveTo(8.0f, 9.456f)
                verticalLineToRelative(0.97f)
                horizontalLineToRelative(2.424f)
                verticalLineToRelative(-0.97f)
                lineTo(8.0f, 9.456f)
                close()
                moveTo(21.09f, 10.426f)
                verticalLineToRelative(-0.97f)
                horizontalLineToRelative(-2.423f)
                verticalLineToRelative(0.97f)
                horizontalLineToRelative(2.424f)
                close()
            }
        }
        .build()
        return _rasa!!
    }

private var _rasa: ImageVector? = null
