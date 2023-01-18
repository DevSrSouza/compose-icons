package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.SpeakerSimpleNone: ImageVector
    get() {
        if (_speakerSimpleNone != null) {
            return _speakerSimpleNone!!
        }
        _speakerSimpleNone = Builder(name = "SpeakerSimpleNone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 228.0f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, true, -2.5f, -0.8f)
                lineTo(78.6f, 172.0f)
                horizontalLineTo(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                verticalLineTo(96.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 32.0f, 84.0f)
                horizontalLineTo(78.6f)
                lineToRelative(70.9f, -55.2f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 156.0f, 32.0f)
                verticalLineTo(224.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -2.2f, 3.6f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 152.0f, 228.0f)
                close()
                moveTo(32.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineTo(80.0f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, true, 2.5f, 0.8f)
                lineToRelative(65.5f, 51.0f)
                verticalLineTo(40.2f)
                lineToRelative(-65.5f, 51.0f)
                arcTo(4.4f, 4.4f, 0.0f, false, true, 80.0f, 92.0f)
                close()
            }
        }
        .build()
        return _speakerSimpleNone!!
    }

private var _speakerSimpleNone: ImageVector? = null
