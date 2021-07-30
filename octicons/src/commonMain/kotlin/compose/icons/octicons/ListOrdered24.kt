package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.ListOrdered24: ImageVector
    get() {
        if (_listOrdered24 != null) {
            return _listOrdered24!!
        }
        _listOrdered24 = Builder(name = "ListOrdered24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.604f, 3.089f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 4.0f, 3.75f)
                lineTo(4.0f, 8.5f)
                horizontalLineToRelative(0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, -1.5f)
                horizontalLineToRelative(0.75f)
                lineTo(2.5f, 5.151f)
                lineToRelative(-0.334f, 0.223f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.832f, -1.248f)
                lineToRelative(1.5f, -1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.77f, -0.037f)
                close()
                moveTo(8.75f, 5.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(11.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(8.75f, 5.5f)
                close()
                moveTo(8.75f, 11.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(11.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(8.75f, 11.5f)
                close()
                moveTo(8.75f, 17.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(11.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(8.75f, 17.5f)
                close()
                moveTo(5.5f, 15.75f)
                curveToRelative(0.0f, -0.704f, -0.271f, -1.286f, -0.72f, -1.686f)
                arcToRelative(2.302f, 2.302f, 0.0f, false, false, -1.53f, -0.564f)
                curveToRelative(-0.535f, 0.0f, -1.094f, 0.178f, -1.53f, 0.565f)
                curveToRelative(-0.449f, 0.399f, -0.72f, 0.982f, -0.72f, 1.685f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                curveToRelative(0.0f, -0.296f, 0.104f, -0.464f, 0.217f, -0.564f)
                arcTo(0.805f, 0.805f, 0.0f, false, true, 3.25f, 15.0f)
                curveToRelative(0.215f, 0.0f, 0.406f, 0.072f, 0.533f, 0.185f)
                curveToRelative(0.113f, 0.101f, 0.217f, 0.268f, 0.217f, 0.565f)
                curveToRelative(0.0f, 0.332f, -0.069f, 0.48f, -0.21f, 0.657f)
                curveToRelative(-0.092f, 0.113f, -0.216f, 0.24f, -0.403f, 0.419f)
                lineToRelative(-0.147f, 0.14f)
                curveToRelative(-0.152f, 0.144f, -0.33f, 0.313f, -0.52f, 0.504f)
                lineToRelative(-1.5f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.22f, 0.53f)
                verticalLineToRelative(0.25f)
                curveToRelative(0.0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                lineTo(5.0f, 20.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 5.0f, 19.0f)
                lineTo(3.31f, 19.0f)
                lineToRelative(0.47f, -0.47f)
                curveToRelative(0.176f, -0.176f, 0.333f, -0.324f, 0.48f, -0.465f)
                lineToRelative(0.165f, -0.156f)
                arcToRelative(5.98f, 5.98f, 0.0f, false, false, 0.536f, -0.566f)
                curveToRelative(0.358f, -0.447f, 0.539f, -0.925f, 0.539f, -1.593f)
                close()
            }
        }
        .build()
        return _listOrdered24!!
    }

private var _listOrdered24: ImageVector? = null
