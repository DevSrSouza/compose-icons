package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.FaceMan: ImageVector
    get() {
        if (_faceMan != null) {
            return _faceMan!!
        }
        _faceMan = Builder(name = "FaceMan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 11.75f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 7.75f, 13.0f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 9.0f, 14.25f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 10.25f, 13.0f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 9.0f, 11.75f)
                moveTo(15.0f, 11.75f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 13.75f, 13.0f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 15.0f, 14.25f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 16.25f, 13.0f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 15.0f, 11.75f)
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                moveTo(12.0f, 20.0f)
                curveTo(7.59f, 20.0f, 4.0f, 16.41f, 4.0f, 12.0f)
                curveTo(4.0f, 11.71f, 4.0f, 11.42f, 4.05f, 11.14f)
                curveTo(6.41f, 10.09f, 8.28f, 8.16f, 9.26f, 5.77f)
                curveTo(11.07f, 8.33f, 14.05f, 10.0f, 17.42f, 10.0f)
                curveTo(18.2f, 10.0f, 18.95f, 9.91f, 19.67f, 9.74f)
                curveTo(19.88f, 10.45f, 20.0f, 11.21f, 20.0f, 12.0f)
                curveTo(20.0f, 16.41f, 16.41f, 20.0f, 12.0f, 20.0f)
                close()
            }
        }
        .build()
        return _faceMan!!
    }

private var _faceMan: ImageVector? = null
