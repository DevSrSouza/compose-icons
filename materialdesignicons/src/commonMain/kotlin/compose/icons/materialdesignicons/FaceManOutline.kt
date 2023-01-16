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

public val MaterialDesignIcons.FaceManOutline: ImageVector
    get() {
        if (_faceManOutline != null) {
            return _faceManOutline!!
        }
        _faceManOutline = Builder(name = "FaceManOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.25f, 13.0f)
                arcTo(1.25f, 1.25f, 0.0f, false, true, 9.0f, 14.25f)
                arcTo(1.25f, 1.25f, 0.0f, false, true, 7.75f, 13.0f)
                arcTo(1.25f, 1.25f, 0.0f, false, true, 9.0f, 11.75f)
                arcTo(1.25f, 1.25f, 0.0f, false, true, 10.25f, 13.0f)
                moveTo(15.0f, 11.75f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 13.75f, 13.0f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 15.0f, 14.25f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 16.25f, 13.0f)
                arcTo(1.25f, 1.25f, 0.0f, false, false, 15.0f, 11.75f)
                moveTo(22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 22.0f, 12.0f)
                moveTo(10.66f, 4.12f)
                curveTo(12.06f, 6.44f, 14.6f, 8.0f, 17.5f, 8.0f)
                curveTo(17.96f, 8.0f, 18.41f, 7.95f, 18.84f, 7.88f)
                curveTo(17.44f, 5.56f, 14.9f, 4.0f, 12.0f, 4.0f)
                curveTo(11.54f, 4.0f, 11.09f, 4.05f, 10.66f, 4.12f)
                moveTo(4.42f, 9.47f)
                curveTo(6.13f, 8.5f, 7.45f, 6.92f, 8.08f, 5.03f)
                curveTo(6.37f, 6.0f, 5.05f, 7.58f, 4.42f, 9.47f)
                moveTo(20.0f, 12.0f)
                curveTo(20.0f, 11.22f, 19.88f, 10.47f, 19.67f, 9.76f)
                curveTo(18.97f, 9.91f, 18.25f, 10.0f, 17.5f, 10.0f)
                curveTo(14.37f, 10.0f, 11.58f, 8.56f, 9.74f, 6.31f)
                curveTo(8.69f, 8.87f, 6.6f, 10.88f, 4.0f, 11.86f)
                curveTo(4.0f, 11.9f, 4.0f, 11.95f, 4.0f, 12.0f)
                curveTo(4.0f, 16.41f, 7.59f, 20.0f, 12.0f, 20.0f)
                curveTo(16.41f, 20.0f, 20.0f, 16.41f, 20.0f, 12.0f)
                close()
            }
        }
        .build()
        return _faceManOutline!!
    }

private var _faceManOutline: ImageVector? = null
