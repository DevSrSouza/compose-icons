package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.SpeakerSimpleNone: ImageVector
    get() {
        if (_speakerSimpleNone != null) {
            return _speakerSimpleNone!!
        }
        _speakerSimpleNone = Builder(name = "SpeakerSimpleNone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 230.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -3.7f, -1.3f)
                lineTo(77.9f, 174.0f)
                horizontalLineTo(32.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                verticalLineTo(96.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 32.0f, 82.0f)
                horizontalLineTo(77.9f)
                lineToRelative(70.4f, -54.7f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 158.0f, 32.0f)
                verticalLineTo(224.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.4f, 5.4f)
                arcTo(5.8f, 5.8f, 0.0f, false, true, 152.0f, 230.0f)
                close()
                moveTo(32.0f, 94.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineTo(80.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 3.7f, 1.3f)
                lineTo(146.0f, 211.7f)
                verticalLineTo(44.3f)
                lineTo(83.7f, 92.7f)
                arcTo(5.8f, 5.8f, 0.0f, false, true, 80.0f, 94.0f)
                close()
            }
        }
        .build()
        return _speakerSimpleNone!!
    }

private var _speakerSimpleNone: ImageVector? = null
