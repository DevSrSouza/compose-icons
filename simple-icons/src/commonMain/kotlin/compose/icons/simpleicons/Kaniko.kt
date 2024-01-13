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

public val SimpleIcons.Kaniko: ImageVector
    get() {
        if (_kaniko != null) {
            return _kaniko!!
        }
        _kaniko = Builder(name = "Kaniko", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.783f, 0.0f)
                horizontalLineToRelative(18.434f)
                curveToRelative(1.352f, 0.0f, 2.478f, 0.963f, 2.73f, 2.24f)
                arcToRelative(17.127f, 17.127f, 0.0f, false, true, -3.2f, 4.42f)
                arcToRelative(16.918f, 16.918f, 0.0f, false, true, -8.399f, 4.605f)
                lineTo(12.348f, 3.304f)
                horizontalLineToRelative(-0.696f)
                lineTo(11.652f, 11.4f)
                curveToRelative(-0.976f, 0.169f, -1.965f, 0.253f, -2.956f, 0.252f)
                verticalLineToRelative(0.696f)
                curveToRelative(1.011f, 0.0f, 1.998f, 0.086f, 2.956f, 0.252f)
                verticalLineToRelative(8.096f)
                horizontalLineToRelative(0.696f)
                verticalLineToRelative(-7.961f)
                arcToRelative(16.918f, 16.918f, 0.0f, false, true, 8.399f, 4.605f)
                arcToRelative(17.127f, 17.127f, 0.0f, false, true, 3.2f, 4.42f)
                arcToRelative(2.783f, 2.783f, 0.0f, false, true, -2.73f, 2.24f)
                lineTo(2.783f, 24.0f)
                arcTo(2.783f, 2.783f, 0.0f, false, true, 0.0f, 21.217f)
                lineTo(0.0f, 2.783f)
                arcTo(2.783f, 2.783f, 0.0f, false, true, 2.783f, 0.0f)
                close()
                moveTo(21.239f, 7.152f)
                arcTo(17.712f, 17.712f, 0.0f, false, false, 24.0f, 3.572f)
                verticalLineToRelative(16.856f)
                arcToRelative(17.712f, 17.712f, 0.0f, false, false, -2.761f, -3.58f)
                arcToRelative(17.802f, 17.802f, 0.0f, false, false, -8.891f, -4.815f)
                verticalLineToRelative(-0.066f)
                arcToRelative(17.802f, 17.802f, 0.0f, false, false, 8.891f, -4.815f)
                close()
            }
        }
        .build()
        return _kaniko!!
    }

private var _kaniko: ImageVector? = null
