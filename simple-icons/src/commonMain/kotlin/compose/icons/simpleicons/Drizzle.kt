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

public val SimpleIcons.Drizzle: ImageVector
    get() {
        if (_drizzle != null) {
            return _drizzle!!
        }
        _drizzle = Builder(name = "Drizzle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.353f, 11.823f)
                arcToRelative(1.036f, 1.036f, 0.0f, false, false, -0.395f, -1.422f)
                arcToRelative(1.063f, 1.063f, 0.0f, false, false, -1.437f, 0.399f)
                lineTo(0.138f, 16.702f)
                arcToRelative(1.035f, 1.035f, 0.0f, false, false, 0.395f, 1.422f)
                arcToRelative(1.063f, 1.063f, 0.0f, false, false, 1.437f, -0.398f)
                lineToRelative(3.383f, -5.903f)
                close()
                moveTo(16.569f, 11.823f)
                arcToRelative(1.036f, 1.036f, 0.0f, false, false, -0.394f, -1.422f)
                arcToRelative(1.064f, 1.064f, 0.0f, false, false, -1.438f, 0.399f)
                lineToRelative(-3.382f, 5.902f)
                arcToRelative(1.036f, 1.036f, 0.0f, false, false, 0.394f, 1.422f)
                curveToRelative(0.506f, 0.283f, 1.15f, 0.104f, 1.438f, -0.398f)
                lineToRelative(3.382f, -5.903f)
                close()
                moveTo(23.862f, 7.298f)
                arcToRelative(1.036f, 1.036f, 0.0f, false, false, -0.395f, -1.422f)
                arcToRelative(1.062f, 1.062f, 0.0f, false, false, -1.437f, 0.399f)
                lineToRelative(-3.383f, 5.902f)
                arcToRelative(1.036f, 1.036f, 0.0f, false, false, 0.395f, 1.422f)
                arcToRelative(1.063f, 1.063f, 0.0f, false, false, 1.437f, -0.399f)
                lineToRelative(3.383f, -5.902f)
                close()
                moveTo(12.643f, 7.298f)
                arcToRelative(1.035f, 1.035f, 0.0f, false, false, -0.394f, -1.422f)
                arcToRelative(1.064f, 1.064f, 0.0f, false, false, -1.438f, 0.398f)
                lineToRelative(-3.382f, 5.903f)
                arcToRelative(1.036f, 1.036f, 0.0f, false, false, 0.394f, 1.422f)
                curveToRelative(0.506f, 0.282f, 1.15f, 0.104f, 1.438f, -0.399f)
                lineToRelative(3.382f, -5.902f)
                close()
            }
        }
        .build()
        return _drizzle!!
    }

private var _drizzle: ImageVector? = null
