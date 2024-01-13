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

public val SimpleIcons.Penny: ImageVector
    get() {
        if (_penny != null) {
            return _penny!!
        }
        _penny = Builder(name = "Penny", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.053f, 11.914f)
                horizontalLineToRelative(0.368f)
                curveToRelative(0.419f, 0.0f, 0.675f, -0.245f, 0.718f, -0.556f)
                curveToRelative(0.043f, -0.27f, -0.154f, -0.556f, -0.547f, -0.556f)
                lineTo(2.24f, 10.802f)
                close()
                moveTo(20.664f, 11.276f)
                lineTo(21.503f, 9.772f)
                horizontalLineToRelative(1.924f)
                lineToRelative(-2.908f, 4.399f)
                lineTo(18.56f, 14.171f)
                lineToRelative(0.933f, -1.26f)
                lineToRelative(-1.07f, -3.049f)
                lineToRelative(-0.727f, 4.309f)
                horizontalLineToRelative(-1.54f)
                lineToRelative(-0.949f, -2.036f)
                lineToRelative(-0.342f, 2.036f)
                horizontalLineToRelative(-1.54f)
                lineToRelative(0.745f, -4.4f)
                horizontalLineToRelative(1.582f)
                lineToRelative(0.915f, 1.971f)
                lineToRelative(0.334f, -1.97f)
                horizontalLineToRelative(3.37f)
                lineToRelative(0.393f, 1.504f)
                close()
                moveTo(13.454f, 9.772f)
                lineTo(12.71f, 14.171f)
                horizontalLineToRelative(-1.54f)
                lineToRelative(-0.949f, -2.036f)
                lineToRelative(-0.342f, 2.036f)
                horizontalLineToRelative(-1.54f)
                lineToRelative(0.745f, -4.4f)
                horizontalLineToRelative(1.582f)
                lineToRelative(0.915f, 1.971f)
                lineToRelative(0.334f, -1.97f)
                horizontalLineToRelative(1.539f)
                close()
                moveTo(3.036f, 9.707f)
                curveToRelative(1.07f, 0.0f, 1.788f, 0.547f, 1.797f, 1.438f)
                lineToRelative(0.23f, -1.373f)
                horizontalLineToRelative(3.49f)
                lineToRelative(-0.188f, 1.112f)
                lineTo(6.517f, 10.884f)
                lineToRelative(-0.094f, 0.523f)
                horizontalLineToRelative(1.668f)
                lineToRelative(-0.188f, 1.104f)
                lineTo(6.235f, 12.511f)
                lineToRelative(-0.094f, 0.548f)
                horizontalLineToRelative(1.873f)
                lineToRelative(-0.188f, 1.112f)
                lineTo(4.32f, 14.171f)
                lineToRelative(0.402f, -2.38f)
                curveToRelative(-0.273f, 0.77f, -1.009f, 1.227f, -1.967f, 1.227f)
                horizontalLineToRelative(-0.88f)
                lineToRelative(-0.198f, 1.153f)
                lineTo(0.0f, 14.171f)
                lineToRelative(0.753f, -4.464f)
                close()
                moveTo(24.0f, 13.345f)
                curveToRelative(0.0f, 0.523f, -0.445f, 0.948f, -0.992f, 0.948f)
                curveToRelative(-0.547f, 0.0f, -0.992f, -0.425f, -0.992f, -0.948f)
                curveToRelative(0.0f, -0.523f, 0.445f, -0.948f, 0.992f, -0.948f)
                curveToRelative(0.556f, 0.008f, 0.992f, 0.425f, 0.992f, 0.948f)
                close()
            }
        }
        .build()
        return _penny!!
    }

private var _penny: ImageVector? = null
