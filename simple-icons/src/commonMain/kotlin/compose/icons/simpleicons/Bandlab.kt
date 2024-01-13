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

public val SimpleIcons.Bandlab: ImageVector
    get() {
        if (_bandlab != null) {
            return _bandlab!!
        }
        _bandlab = Builder(name = "Bandlab", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.32f, 6.076f)
                lineToRelative(3.567f, 6.164f)
                arcTo(8.835f, 8.835f, 0.0f, false, true, 24.0f, 16.255f)
                curveTo(24.0f, 20.76f, 20.455f, 24.0f, 15.425f, 24.0f)
                horizontalLineToRelative(-6.85f)
                curveTo(3.545f, 24.0f, 0.0f, 20.76f, 0.0f, 16.255f)
                arcToRelative(8.925f, 8.925f, 0.0f, false, true, 1.102f, -4.015f)
                lineToRelative(3.567f, -6.164f)
                horizontalLineToRelative(3.349f)
                lineTo(3.84f, 13.342f)
                arcToRelative(6.033f, 6.033f, 0.0f, false, false, -0.829f, 2.869f)
                curveToRelative(0.0f, 2.869f, 1.964f, 4.909f, 5.651f, 4.909f)
                horizontalLineToRelative(6.654f)
                curveToRelative(3.709f, 0.0f, 5.662f, -2.04f, 5.662f, -4.909f)
                arcToRelative(6.043f, 6.043f, 0.0f, false, false, -0.829f, -2.869f)
                lineToRelative(-4.167f, -7.266f)
                horizontalLineToRelative(3.338f)
                close()
                moveTo(10.876f, 17.585f)
                curveToRelative(-1.581f, 0.0f, -2.531f, -0.927f, -2.531f, -2.236f)
                curveToRelative(0.0f, -1.789f, 1.822f, -3.349f, 3.819f, -3.785f)
                lineTo(7.473f, 0.0f)
                horizontalLineToRelative(8.182f)
                lineToRelative(1.505f, 2.891f)
                horizontalLineToRelative(-5.727f)
                lineToRelative(3.414f, 8.345f)
                curveToRelative(0.295f, 0.655f, 0.448f, 1.364f, 0.448f, 2.073f)
                curveToRelative(0.0f, 2.476f, -2.455f, 4.276f, -4.419f, 4.276f)
                close()
            }
        }
        .build()
        return _bandlab!!
    }

private var _bandlab: ImageVector? = null
